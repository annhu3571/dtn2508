import com.vti.dtn2508.entity.Account;
import com.vti.dtn2508.entity.StudentV2;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(1);
        printf(integers);
    }

    private static void printf(ArrayList<? extends  Number> numbers) {
        for(Number number : numbers) {
            System.out.println(number);
        }
    }
}
