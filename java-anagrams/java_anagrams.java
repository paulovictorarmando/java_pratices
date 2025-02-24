import java.util.Scanner;

public class Solution {
    
    static boolean cmp(String a, String b, int i)
    {
        char l = a.charAt(i);
        int in_a = 0;
        int in_b = 0;
        int j = 0;
        while (j < a.length())
        {
            if (a.charAt(j) == l)
                in_a++;
             if (b.charAt(j) == l)
                in_b++;
            j++;
        }
        return (in_a == in_b);
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length())
            return false;
        for (int i = 0; i< a.length(); i++)
        {
            if (!cmp(a.toUpperCase(), b.toUpperCase(), i))
                return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
