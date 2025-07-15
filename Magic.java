import java .util.*;
public class Magic {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sum=0;
     while(n<9){
        sum=0;
        while(n!=0){
            int d =n%10;
            sum = sum + d;
            n=n/10;
        }
        n=sum;
     }
     if (sum==1){
        System.out.println("Magic No.");
     }
     else {
        System.out.println("Not a Magic No.");
     }
    }
}
