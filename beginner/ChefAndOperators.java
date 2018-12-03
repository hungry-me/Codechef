/*
Chef has just started Programming, he is in first year of Engineering. Chef is reading about Relational Operators.
Relational Operators are operators which check relatioship between two values.
Given two numerical values A and B you need to help chef in finding the relationship between them that is,
First one is greater than second or,
First one is less than second or,
First and second one are equal.
*/
package beginner;
import java.util.Scanner;
public class ChefAndOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong(), b = sc.nextLong();
            if (a < b)
                System.out.println("<");
            else if (a > b)
                System.out.println(">");
            else
                System.out.println("=");
        }
    }
}
