import java.util.Scanner;

public class sumOfOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int n=sc.nextInt();
        int m=0;
    
        for(int i=1;i<=n;i=i+1){

            if(i%2!=0){
                m=m+i;
            }
            
        }
        System.out.println(m);
    }
    
}