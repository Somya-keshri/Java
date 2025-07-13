package code;

import  java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q. Print num from 1 to 5
        for(int i=1; i<=5; i+=1){
            System.out.print(i + " ");
        }

        // print num from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num=1; num<=n; num++){
//            System.out.print(num + " ");
            System.out.print("Hyy  ");
        }

        // WHILE LOOP
        int num = 1;
        while(num <= 5){
            System.out.print(num + " ");
            num += 1;
        }

        // DO WHILE LOOP
        int m = 1;
        do{
            System.out.print("do ");
            m++;
        }while(m <= 5);
    }
}
