import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Pair> nums = new ArrayList<>();
        int n = s.nextInt();
        while (n-- > 0) {
            String input = s.next();
            nums.add(new Pair(new BigDecimal(input), input));
        }
        nums.stream()
            .sorted(Comparator.comparing((Pair p) -> p.num).reversed())
            .forEach(p -> System.out.println(p.original));
    }
    static class Pair {
        BigDecimal num;
        String original;
        Pair(BigDecimal num, String original) {
            this.num = num;
            this.original = original;
        }
    }
}
