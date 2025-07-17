import java.util.*;
//SWARAJ CHIKHALE
class demo {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n =sc.nextInt();
        int countEven =0;
        int countOdd =0;
    
        while(n!=0){
            int d =n%10;
            if (d%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
            n=n/10;
        }
        System.out.println("Even Count : "+countEven);
        System.out.println("Odd Count : "+countOdd);
        int diff= countEven -countOdd;
        System.out.println("Difference Of Count : "+ diff);
    }
}