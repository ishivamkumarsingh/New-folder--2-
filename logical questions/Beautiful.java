// Separate the Numbers
 
// Problem Description:
// A numeric string s is said to be beautiful if it can be split into a sequence of two or more positive integers, where:
// 1. The values are strictly increasing by exactly 1.
// 2. No leading zeroes are allowed in any number.
 
// Your task is to determine if the string s can be split into such a sequence. If it can, print YES x, where x is the first number in the sequence. If it cannot, print NO.
 
// Input Format:
// A single integer q, the number of test cases.
// For each test case, a single string s is provided.
 
// Constraints:
// 1≤𝑞≤10
// 1≤∣s∣≤32
// Each string s consists of digits only.
 
// Output Format:
// For each test case:
 
// 1. Print YES x if the string can be split into a beautiful sequence, where x is the first number.
// 2. Print NO if it cannot.
 
// Example Input:
// 7
// 1234
// 91011
// 99100
// 101103
// 010203
// 13
// 1
 
// Example Output:
// YES 1
// YES 9
// YES 99
// NO
// NO
// NO
// NO
 
// Explanation:
// 1234 → Can be split as 1, 2, 3, 4. The first number is 1.
// 91011 → Can be split as 9, 10, 11. The first number is 9.
// 99100 → Can be split as 99, 100. The first number is 99.
// 101103 → Cannot be split into a beautiful sequence.
// 010203 → Invalid because of leading zeroes.
// 13 → Cannot be split into a beautiful sequence.
// 1 → Cannot be split as it has only one digit.
// has context menu

public class Beautiful {

    public static void BeautifulSequence(String input) {
        int length = input.length();
       
        for (int i = 1; i <= length / 2; i++) {
            String first = input.substring(0, i);
            if (first.charAt(0) == '0') {
                continue; 
            }
            StringBuilder sequence = new StringBuilder(first);
            int next = Integer.parseInt(first) + 1; 
            while (sequence.length() < length) {
                sequence.append(next);
                next++;
            }
            if (sequence.toString().equals(input)) {
                System.out.println("YES " + first);
                return;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        String[] cases = {  "5678", "909192" };

        for (int i = 0; i < cases.length; i++) {
            String str = cases[i];
            BeautifulSequence(str);
        }
    }
}