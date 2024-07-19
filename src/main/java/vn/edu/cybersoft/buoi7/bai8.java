package vn.edu.cybersoft.buoi7;

import vn.edu.cybersoft.pkg.utils;

import java.util.List;
import java.util.Scanner;

public class bai8 {
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

            System.out.println("Cac phan tu chan cua mang nay la ");
            printEvenInList(list);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    //
    private static void printEvenInList(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            if (utils.isEven(list.get(i))){
                System.out.print(list.get(i)+ " ");
            }
        }
    }
}
