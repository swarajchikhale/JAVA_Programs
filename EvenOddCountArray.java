import java.util.Scanner;
import java.util.Arrays;
//SWARAJ CHIKHALE
class demo {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number OF Elements :");
        int n =sc.nextInt();
        int  a[] =new int[n];
        int c =0;

        for (int i=0;i<=a.length-1;i++){
            a[i]= sc.nextInt();
        }
        String  b =Arrays.toString(a);
        System.out.println("Original Array"+b);
        int evcount=0;
        int odcount=0;
        for(int i=0;i<=a.length-1;i++){
            if(a[i]%2==0){
                evcount++;
            }
            else{
                odcount++;
            }
        }
        System.out.println("Even Count :"+evcount);
        System.out.println("Odd Count :"+odcount);
    }
}