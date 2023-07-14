public class forLoopBasic {

    public static void main(String[] args) {
        for(int i=1;i<=30;i=i+1){
            int a=i%2;
            if(a==0){
                System.out.println(i);
            }
        }
    }
}