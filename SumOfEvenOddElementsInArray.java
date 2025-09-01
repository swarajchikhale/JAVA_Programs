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
        
        int Sumev = 0;
        int Sumod =0;
        for (int i=0;i<=a.length-1;i++){
            if(a[i]%2==0){
            Sumev =Sumev + a[i];
            }
            else{
            Sumod =Sumod +a[i];
            }
        
        }
        System.out.println("Sum Even :"+Sumev);
        System.out.println("Sum Odd :" +Sumod);

        int diff = Sumev-Sumod; 
        System.out.println("Difference :"+ Math.abs(diff));


    }
}