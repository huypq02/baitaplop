package vn.edu.cybersoft.buoi7;

import vn.edu.cybersoft.pkg.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai7 {
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
            System.out.printf("Nhap vao %d phan tu so nguyen\n", n);
            List<Integer> list;
            list = utils.addNElementList(n);

            System.out.println("Cac gia tri cua mang nay la ");
            printList(list);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    //
    private static void printList(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}
