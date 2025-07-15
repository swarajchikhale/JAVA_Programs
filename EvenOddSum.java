import java.util.*;
//SWARAJ CHIKHALE
class demo {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum =0;
        int od=0;
        int ev=0;
    
        while(n!=0){
            int d=n%10;
            if (d%2==0){
                 ev=ev+d;
            }
            else{
                od=od+d;
            }
            sum=sum+d;
            n=n/10;
        }
        System.out.println("sum of all digits :"+sum);
        System.out.println("sum of even:"+ev);
        System.out.println("sum of odd :"+od);
        int diff=od-ev;
        System.out.println("Difference of odd&Even :"+ diff);
    }
}