package vn.edu.cybersoft.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class utils {
    public static boolean isGreaterZero(int num){
        return (num > 0);
    }

    public static boolean isEven(int num){
        return num%2 == 0;
    }

    public static boolean isPrime(int num){
        if (num <= 1) return false;
        int count = 0;
        for (int i = 1; i < num; i++){
            if ((num%i) == 0){
                count++;
            }
        }
        return count == 2;
    }

    public static double averageInList(List<Integer> list){
        // Using  for loop for iteration
        double avg = 0;
        for (int i = 0; i < list.size(); i++) {

            // Using get() method to
            // access particular element
            System.out.print(list.get(i) + " ");
            avg += list.get(i);
        }
        System.out.println();
        return avg / list.size();
    }

    public static double maxElementInList(List<Double> list){
        // Using  for loop for iteration
        double max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }

    public static double minElementInList(List<Double> list){
        // Using  for loop for iteration
        double min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min < list.get(i)){
                min = list.get(i);
            }
        }
        return min;
    }

    public static List<Integer> addNElementList(int n) {
        List<Integer> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            l.add(sc.nextInt());
        }
        return l;
    }

    public static List<Double> addDoubleTypeForElementList(int n) {
        List<Double> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            l.add(sc.nextDouble());
        }
        return l;
    }
}
