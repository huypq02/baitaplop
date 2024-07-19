package vn.edu.cybersoft.buoi7;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao chieu rong cua hinh vuong");
            double width = sc.nextDouble();
            if (!utils.isGreaterZero((int)width)) {
                System.out.println("width should be greater 0");
                return;
            }
            //
            System.out.println("Dien tich hinh vuong la " + acreage(width));
            System.out.println("Chu vi hinh vuong la " + perimeter(width));

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    // dien tich
    private static double acreage(double width){
        return width*width;
    }

    // chu vi
    private static double perimeter(double width){
        return 4*width;
    }
}
