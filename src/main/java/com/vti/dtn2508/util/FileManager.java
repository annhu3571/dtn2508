package com.vti.dtn2508.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileManager {


    public static void downloadFile(String fileLink, String folderSave) throws Exception {
        // create folder
        createFolder(fileLink, folderSave);
        // create name
        String fileName = createFileName(fileLink, folderSave);
        // download file
        downLoadFile(fileLink, folderSave, fileName);
    }

    private static void createFolder(String fileLink, String folderSave) {
        File folder = new File(folderSave);
        if (!folder.exists()) {
            folder.mkdirs();
        }
    }

    private static String createFileName(String fileLink, String folderSave) {
        // create file name
        String fileName = fileLink.substring(fileLink.lastIndexOf("/") + 1);
        File file = new File(folderSave + "/" + fileName);

        // Xử lý trùng tên (thêm số 1, 2...)
        int count = 1;
        while (file.exists()) {
            String name = fileName.substring(0, fileName.lastIndexOf("."));
            String ext = fileName.substring(fileName.lastIndexOf("."));
            file = new File(folderSave + "/" + name + "(" + count + ")" + ext);
            count++;
        }

        return fileName;
    }

    private static void downLoadFile(String fileLink, String folderSave, String fileName)  throws Exception{
        File file = new File(folderSave + "/" + fileName);
        URL url = new URL(fileLink);
        URLConnection connection = url.openConnection();
        InputStream in = null;
        FileOutputStream output = null;
        try {
            in = connection.getInputStream();
             output = new FileOutputStream(file);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
        } finally {
            output.close();
            in.close();
        }


        // try with resource

        System.out.println("Download thành công: " + file.getAbsolutePath());
    }
}
