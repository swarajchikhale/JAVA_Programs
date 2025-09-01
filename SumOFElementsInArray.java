import java.util.*;
//SWARAJ CHIKHALE
class demo {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements :");
        int  a[] =new int[5];

        for (int i=0;i<=a.length-1;i++){
            a[i]= sc.nextInt();
        }
        
        int Sum = 0;
        for (int i=0;i<=a.length-1;i++){
            Sum =Sum + a[i];
        
        }
        System.out.println(Sum);
    }
}