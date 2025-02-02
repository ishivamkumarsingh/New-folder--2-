interface CheckPalindrome {
    boolean check(String str);
}

public class Palindronee {
    public static void main(String[] args) {
        CheckPalindrome isPalindrome = str -> {
            if (str == null) return false;
            int l = str.length();
            int i = 0;
            int j = l - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                i++;
                j--;
                }
                return true;
            };

        String test1 = "madam";
       

        System.out.println(isPalindrome.check(test1));
       
    }
}
