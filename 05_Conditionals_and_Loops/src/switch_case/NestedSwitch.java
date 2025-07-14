package switch_case;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();

        // alt + enter => enhanced switch statement
        switch (empID) {
            case 1 -> System.out.println("Somya Keshri");
            case 2 -> System.out.println("Ujjwal Keshri");
            case 3 -> {
                String dept = in.next();
                System.out.println("Emp no. 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT Dept");
                    case "CSE" -> System.out.println("CSE Dept");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
