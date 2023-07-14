import java.util.Scanner;

public class ArmstrongForLoop {

    public static void main(String[] args) {
        int digit;
        int arm=0;
        int og;
        System.out.println("Enter Number check Armstrong");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        og=n;


        for( ;n!=0;n/=10){

            digit=n%10;
            arm=arm+(digit*digit*digit);




        }
        if(arm==og){
            System.out.println("It is a Armstrong ");
        }else{
            System.out.println("It is not a Armstrong");
        }
    }
}