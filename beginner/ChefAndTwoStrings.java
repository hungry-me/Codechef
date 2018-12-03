package beginner;

import java.util.Scanner;
public class ChefAndTwoStrings {
    public static int[] getCount(String s1,String s2){
        int ar[]=new int[2];
        for (int i=0;i<s1.length();i++){
            int f=(int)s1.charAt(i),s=(int)s2.charAt(i);
            if(s1.charAt(i)=='?' || s2.charAt(i)=='?')
                ar[1]++;
            else if(s1.charAt(i)!=s2.charAt(i)) {
                ar[0]++;
                ar[1]++;
            }
        }
        return ar;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            String s1=sc.next(),s2=sc.next();
            int ar[]=new int[2];
            ar=getCount(s1,s2);
            System.out.println(ar[0]+" "+ar[1]);
        }
    }
}
