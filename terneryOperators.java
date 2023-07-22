import java.util.*;

public class terneryOperators {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = scn.nextInt();
       String result = (marks>33)? "Pass": "Fail";

       System.out.println(result);

       System.out.println("Enter number x:");
       int x= scn.nextInt();
       int y;

       y= (x>=10)? 1: 0;
       System.out.println(y);
    }
}
