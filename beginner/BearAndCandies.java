package beginner;
import java.util.Scanner;
public class BearAndCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int j=0;j<t;j++){
            int a=sc.nextInt(),b=sc.nextInt();
            boolean flag=false;
            for (int i=1;!flag;i++){
                if(a<0){
                    System.out.println("Bob");
                    flag=true;
                }
                if(b<0){
                    System.out.println("Limak");
                    flag=true;
                }
                if(i%2!=0)
                    a-=i;
                else
                    b-=i;
            }
        }
    }
}
