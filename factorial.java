import java.util.*;
public class factorial {
    int fact(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n * fact(n-1);
        }
    }
    public static void main(String []args ){
        Scanner  sc = new  Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        factorial obj=new factorial();
        System.out.println(obj.fact(n));
    }
}
