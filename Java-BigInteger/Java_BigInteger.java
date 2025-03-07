import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sn = new Scanner(System.in);
        BigInteger a = new BigInteger(sn.next());
        BigInteger b = new BigInteger(sn.next());
        System.out.println(a.add(b)+"\n"+a.multiply(b));
    }
}
