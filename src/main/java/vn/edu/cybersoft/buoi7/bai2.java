package vn.edu.cybersoft.buoi7;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao 1 so nguyen (tu 1 den 10)");
            int num = sc.nextInt();
            //
            numberToString(num);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    private static void numberToString(int number){
        switch (number){
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
            case 10:
                System.out.println("Mười");
                break;
            default:
                System.out.println("Chi chap nhan so tu 1 den 10");
        }
    }
}
