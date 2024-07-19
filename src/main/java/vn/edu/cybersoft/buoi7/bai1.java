package vn.edu.cybersoft.buoi7;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao 1 so nguyen");
            int num = sc.nextInt();
            if (utils.isGreaterZero(num)){
                System.out.println("Đây là số nguyên dương");
                return;
            }
            System.out.println("Đây là số nguyên âm");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
