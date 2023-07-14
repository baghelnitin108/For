import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;

        for(int i=1;i<=n;i++){
            int m=sc.nextInt();

            if(max<m){
                max=m;
            }
            

        }System.out.println(max);
    }
}