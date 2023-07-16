import java.util.*;
public class tables{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter any number");
        int n = scn.nextInt();
        int s = scn.nextInt();
        int e = scn.nextInt();
            int a=0;
            System.out.println("Tables of "+n+ " from "+ s +" to "+ e +" is : ");
        for(int i=s; i<=e; i++){
    
        a=n*i;
        System.out.print(a+" ");
        }
    }
}
