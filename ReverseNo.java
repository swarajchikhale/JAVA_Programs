import java.util.*;
//SWARAJ CHIKHALE
class demo {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n =sc.nextInt();
        int rev =0;
        while(n!=0){
            int d =n%10;
            rev = rev*10+d;
            n=n/10;
        }
        System.out.println("Reverse No. : "+rev);
    }
}