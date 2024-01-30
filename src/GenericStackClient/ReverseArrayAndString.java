package GenericStackClient;

import java.util.Stack;

public class ReverseArrayAndString {
    public static void main(String[] args) {
        // Đảo ngược mảng số nguyên
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        System.out.println("Mảng sau khi đảo ngược: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Đảo ngược chuỗi
        String inputString = "Hello, World!";
        String reversedString = reverseString(inputString);
        System.out.println("\nChuỗi sau khi đảo ngược: " + reversedString);
    }

    // Đảo ngược phần tử trong mảng số nguyên sử dụng Stack
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int num : array) {
            stack.push(num);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    // Đảo ngược chuỗi sử dụng Stack
    public static String reverseString(String input) {
        Stack<Character> charStack = new Stack<>();
        for (char ch : input.toCharArray()) {
            charStack.push(ch);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversedString.append(charStack.pop());
        }

        return reversedString.toString();
    }
}
