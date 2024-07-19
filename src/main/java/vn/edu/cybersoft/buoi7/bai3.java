package vn.edu.cybersoft.buoi7;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao 1 so nguyen duong n");
            int num = sc.nextInt();
            if (!utils.isGreaterZero(num)) {
                System.out.println("n should be greater 0");
                return;
            }
            //
            System.out.println("Tong cac so chan trong khoang tu 0 - n la " + sumEven(num));
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    private static int sumEven(int n){
        int sum = 0; // [0, n]
        for (int i = 0; i < n+1; i ++){
            if (utils.isEven(n)) sum++;
        }
        return sum;
    }
}
