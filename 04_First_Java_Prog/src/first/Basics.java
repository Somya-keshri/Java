package first;

public class Basics {
    public static void main(String[] args) {
        int a = 10;
        if(a == 10){
            System.out.println("Hello World");
        }

        // while loop
        System.out.println("While loop");
        int count = 1;
        while(count != 5){
            System.out.println(count);
            count++;
        }

        // for loop
        System.out.println("For loop");
        for(int num = 1; num != 5; num++){
            System.out.println(num);
        }
    }
}
