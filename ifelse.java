package Dhruv_Java;
import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("If else program");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int button=sc.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
        
            case 2:
            System.out.println("Namaste");
                break;
        
            case 3:
            System.out.println("Bonjour");
                break;
            default:
            System.out.println("Invalid button");
                break;
        }
        sc.close();
    }
}
