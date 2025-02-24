import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int i = A.length()-1;
        for(int j = 0; j <= i; j++)
        {
            if (A.charAt(i) != A.charAt(j))
            {
                System.out.println("No");
                return ;
            }
            i--;
        }
        System.out.println("Yes");
        sc.close();
    }
}
