import java.util.*;

public class pattern_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        for(int i=1; i<=n;i++){
            for(int j=1; j<=4; j++){
                System.out.print("*"+" ");
            }
            
            System.out.println();
        }
    }
    
}
