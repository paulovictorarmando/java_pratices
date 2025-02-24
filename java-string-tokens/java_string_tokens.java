import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        if (s.isEmpty())
            System.out.println(0);
        else{
            String[] new_s = s.split("[,_.'@!?\\s]+");
            System.out.println(new_s.length);
            for (int i = 0; i< new_s.length; i++)
                System.out.println(new_s[i]);
        }
        scan.close();
    }
}
