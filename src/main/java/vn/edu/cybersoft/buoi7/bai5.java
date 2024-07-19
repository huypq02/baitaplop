package vn.edu.cybersoft.buoi7;

import vn.edu.cybersoft.pkg.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao n");
            int n = sc.nextInt();
            if (!utils.isGreaterZero(n)) {
                System.out.println("n should be greater 0");
                return;
            }
            //
            System.out.printf("Nhap vao %d phan tu\n", n);
            List<Double> list;
            list = utils.addDoubleTypeForElementList(n);

            System.out.printf("So lon nhat %2f\n", utils.maxElementInList(list));
            System.out.printf("So lon nhat %2f\n", utils.minElementInList(list));
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
