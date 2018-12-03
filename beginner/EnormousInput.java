package beginner;
import java.util.Scanner;
class EnormousInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong(),cn=0;
        for (int i=0;i<n;i++){
            long z=sc.nextLong();
            if(z%k==0)
                cn++;
        }
        System.out.println(cn);
    }
}
