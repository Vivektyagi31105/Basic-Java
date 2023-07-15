import java.util.*;
import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type number:");
        int num1= scn.nextInt();

        System.out.println("Output is : " + num1);
        System.out.println(num1/2);

        // System.out.println(num1);
        // System.out.println("num1");

        scn.close();
        
    }
}
