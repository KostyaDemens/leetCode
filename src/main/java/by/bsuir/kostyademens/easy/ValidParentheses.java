package by.bsuir.kostyademens.easy;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                chars.push(c);
            } else {
                if (chars.isEmpty()) {
                    return false;
                }
                char lastOpen = chars.pop();
                if ((c == ')' && lastOpen != '(') || (c == '}' && lastOpen != '{') || (c == ']' && lastOpen != '[')) {
                    return false;
                }
            }
        }
        return chars.isEmpty();
    }
}
