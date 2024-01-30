package GenericStackClient;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Chuyển đổi chuỗi thành chữ thường và loại bỏ khoảng trắng
        str = str.toLowerCase().replaceAll("\\s", "");

        // Sử dụng Stack và Queue để kiểm tra Palindrome
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
            queue.offer(c);
        }

        // So sánh từng cặp ký tự từ Stack và Queue
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return false; // Nếu có ký tự khác nhau, không phải Palindrome
            }
        }

        return true; // Nếu đã kiểm tra hết và không có khác biệt, đây là Palindrome
    }

    public static void main(String[] args) {
        String palindromeStr = "Able was I ere I saw Elba";
        if (isPalindrome(palindromeStr)) {
            System.out.println("'" + palindromeStr + "' is a palindrome.");
        } else {
            System.out.println("'" + palindromeStr + "' is not a palindrome.");
        }
    }
}
