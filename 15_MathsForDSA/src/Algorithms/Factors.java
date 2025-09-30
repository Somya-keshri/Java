package Algorithms;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors1(20);
        factors2(35);
        factors3(45);
    }

    // O(n)
    static void factors1(int n) {
        System.out.print(n + " = ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // O(sqrt(n))
    static void factors2(int x) {
        System.out.print(x + " = ");
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                if (x/i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + x/i + " ");
                }
            }
        }
        System.out.println();
    }

    // both time and space with be O(sqrt(n))
    static void factors3(int y) {
        System.out.print(y + " = ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(y); i++) {
            if (y % i == 0) {
                if (y/i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(y/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
