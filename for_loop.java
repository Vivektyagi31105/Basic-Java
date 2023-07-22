import java.util.*;

public class for_loop {
    public static void main(String[] args) {
        for(int i=90; i<=100; i++){
            System.out.println(i);
        }
        System.out.println("-------------");
        
        for(int i=1; i<=20; i++){
            if(i%2==0){
            System.out.println(i);
            }
        }
        System.out.println("----------------");

        for(int i=2; i<20; i++){
            if(i%2==0 && i%3==0){
                System.out.println(i);
            }
        }
        System.out.println("----------");

        for(int i=15; i>=2; i--){
    System.out.println(i);
     }
    //  reverse
        for(int i=15; i>=2; i--){
             if(i%5==0){
    System.out.println(i);
 }
}
    
    }
}
