package algorithm.reverseString;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Yolo22082000";
        // String builder:
        StringBuilder temp = new StringBuilder(input);
        System.out.println("String builder: " + temp.reverse());
        // Stack:
        StringBuilder reverse = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            reverse.append(stack.pop());
        }
        System.out.println("Stack method :" + reverse);
    }
}
