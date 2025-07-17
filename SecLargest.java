import java.util.Scanner;
//SWARAJ CHIKHALE
class demo{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int largest=0;
        int org=n;
        int d=0;

        while(n!=0){
            d=n%10;
            if(d>largest){
                largest=d;
            }
            n=n/10;
        }

        int seclargest=0;

        while(org!=0){
            d=org%10;
            if(d>seclargest && d!=largest){
                seclargest=d;
            }
            org=org/10;
        }

        System.out.println("largest:"+largest);
        System.out.println("Second Largest :"+seclargest);
    }
}