import java.util.*;
//SWARAJ CHIKHALE
class demo {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        int org =n;
        int org1=n;
        int sum=0;
        
        while(n!=0){
            n=n/10;
            count++;
            }
        
        while(org!=0){
           int  d=org%10;
            sum= sum + (int)Math.pow(d,count);
            org=org/10;
        }

        if (org1 == sum){
            System.out.println("It is Armstrome Number");
         }
        else{
          System.out.println("It is Armstrome Number");
         }
        
    }
}