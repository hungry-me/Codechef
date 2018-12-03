package beginner;
import java.util.Scanner;
public class VersionControlSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int a[] = new int[m], b[] = new int[k];
            for (int j = 0; j < m; j++)
                a[j] = sc.nextInt();
            for (int j = 0; j < k; j++)
                b[j] = sc.nextInt();
            int both = 0, uboth = 0;
            for (int x = 0; x < m; x++) {
                for (int y = 0; y < k; y++)
                    if (a[x] == b[y])
                        both++;
            }
            while (n > 0) {
                int f1 = 0, f2 = 0;
                for (int x = 0; x < m; x++) {
                    if (n == a[x])
                        f1 = 1;
                }
                for (int y = 0; y < k; y++) {
                    if (n == b[y])
                        f2 = 1;
                }
                if (f1 == 0 && f2 == 0)
                    uboth++;
                n--;
            }
            System.out.println(both + " " + uboth);
        }
    }
}
