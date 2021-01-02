import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder input1 = new StringBuilder();
        input1.append(A);
        input1 = input1.reverse();

        System.out.println(A.equals(input1.toString()) ? "Yes" : "No");
    }
}



