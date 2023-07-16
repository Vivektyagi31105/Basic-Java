public class logicalOperators {
    public static void main(String[] args) {
        //  || - OR operators = if one condition is true from two or more condition 
        // && -  AND operators= if all condition are true from all conditions
        //  != - not equal = 

        int a= 15;
        int b= 10;
        int c= 10;

        if(a==10 || b==10){
            System.out.println("One condition is true");
        }else{
            System.out.println("Both conditions are false");
        }

        if(a==c && b==c){
            System.out.println("One condition executed true.");
        }else{
            System.out.println("Both are failed.");
        }

        if(a!=b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
