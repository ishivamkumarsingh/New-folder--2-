// Sherlock and the Valid String
 
// Problem Description:

// Sherlock considers a string valid if the frequency of all characters in the string is the same. In other words, the number of occurrences of every character in the string must be the same.
 
// You need to determine if a given string is valid, meaning it can be rearranged or modified to make all characters have the same frequency. A string is invalid if more than one character frequency is different, and you cannot modify the string by adding or removing more than one character.
 
// Input Format:

// A single string s (1 ≤ |s| ≤ 10^5), consisting of lowercase English letters.
 
// Output Format:

// If the string can be made valid, print "YES".

// If the string cannot be made valid, print "NO".
 
 
// Example Input 1:

// aabbcc
 
// Example Output 1:

// YES
 
// Explanation:

// All characters in the string have the same frequency (2 occurrences each). So, the string is valid.
 
// Example Input 2:

// aabbc
 
// Example Output 2:

// YES
 
// Explanation:

// The string can be made valid by removing one occurrence of the character 'c', resulting in the string "aabb", which hasequal frequency for all characters.
 
import java.util.Arrays;

public class SherlockValidString {

    public static String isValid(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int i = 0;
        while (i < 26 && freq[i] == 0) {
            i++;
        }
        int minFreq = freq[i];
        int maxFreq = freq[25];
        if (minFreq == maxFreq) {
            return "YES";
        }
        int countMin = 0, countMax = 0;
        for (int j = i; j < 26; j++) {
            if (freq[j] == minFreq) {
                countMin++;
            } else if (freq[j] == maxFreq) {
                countMax++;
            } else {
                return "NO";
            }
        }
        if ((minFreq == 1 && countMin == 1) || (maxFreq - minFreq == 1 && countMax == 1)) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        String s1 = "aabbcc";
        System.out.println(isValid(s1));
        String s2 = "aabbc";
        System.out.println(isValid(s2));
        String s3 = "aabbcd";
        System.out.println(isValid(s3));
        String s4 = "qqqqqwwwwe";
        System.out.println(isValid(s4));
    }
}