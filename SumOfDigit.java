import java.util.*;
//SWARAJ CHIKHALE
class demo {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum =0;
    
        while(n!=0){
            int d=n%10;
            System.out.println(d);
            sum=sum+d;
            n=n/10;
        }
        System.out.println("sum :"+sum);
    }
}