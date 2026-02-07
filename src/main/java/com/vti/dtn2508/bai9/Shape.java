package com.vti.dtn2508.bai9;

import com.mysql.cj.PreparedQuery;

import java.sql.ResultSet;

public class Shape {
    private String name;

    public Shape(String name) {
//        PreparedQuery
        this.name = name;
    }

    public void printCoordinate(int x, int y) {
        class Coordinate {
            private int x;
            private int y;

            public  Coordinate(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        Coordinate coordinate = new Coordinate(x, y);
        System.out.println("Gia tri cua x:"+ coordinate.x + "\n Gia tri cua y: " + coordinate.y);
    }


}
