import java.util.Scanner;

public class sumOfNatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int n=sc.nextInt();
        int m=0;
    
        for(int i=1;i<=n;i++){
             m=m+i;
        }System.out.println(m);
    }
    
}
