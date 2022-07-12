package level2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           String line = in.nextLine();
           Parentheses a = new Parentheses();
        System.out.println(a.ParenthesesInString(line));

    }

}
