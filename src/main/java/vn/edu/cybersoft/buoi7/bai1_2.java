package vn.edu.cybersoft.buoi7;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class bai1_2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao 1 so nguyen");
            int num = sc.nextInt();
            if (utils.isPrime(num)){
                System.out.println("So nguyen to");
                return;
            }
            System.out.println("Khong phai so nguyen to");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
