import java.util.*;
//SWARAJ CHIKHALE
class demo {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n =sc.nextInt();
        int rev =0;
        int org =n;

        if(n==0){
                        System.out.println(0);
            return;
        }
        while(n!=0){
            int d =n%10;
            rev = rev*10+d;
            n=n/10;
        }
        if (org==rev){
            System.out.println("It is a Palindrome Number");
        }
        else{
        System.out.println("It is Not a Palindrone Number");
        }
    }
}