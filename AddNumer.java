import java.util.Scanner;

public class AddNumer {

    public static void main(String[] args) {
        int digit;
        int a=0;
        int og;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        og=n;


        for( ;n!=0;n/=10){

            digit=n%10;
            a=a+digit;




        }
        if(a==og){
            
        
        }
        
        System.out.println(a);
    }
}