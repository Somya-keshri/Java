package scope;

public class BlockScope {
    public static void main(String[] args) {
        int a = 25;
        int b = 30;
        String name = "Ironman";
        {
//            int a = 15;  // already initialized outside the block in the same method, hence cannot initialize it again
            a = 100; // can modify it but not reinitialize (reassign the original ref variable to some other value)
            System.out.println(a);  // original one is changed

            int c = 71;
            // values initialized int this block will remain in this block

            System.out.println(name);    // Ironman
            name = "Batman";
            System.out.println(name);   // Batman
        }

//        System.out.println(c);   // cannot access outside the block
        int c = 65;
        System.out.println(a);     // 100
        System.out.println(name);   // Batman

        // anything that u initialize outside the block, can be use inside the block
        // anything that u initialize inside the block, cannot be use outside the block

        // anything that initialize outside the block, cannot be reinitialize inside the block
        // but anything that u initialize inside the block, can definitely be initialize outside the block

        // same concept for for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            int num = 31;
            a = 50;
        }
//        System.out.println(i);    // error
    }
}