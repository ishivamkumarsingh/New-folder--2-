import java.util.Scanner;
interface DecimalToBinary {
    String convert(int num);
}

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        DecimalToBinary converter = num -> {
            String binary = "";
            while (num > 0) {
                binary = (num % 2) + binary;
                num /= 2;
            }
            if (binary.isEmpty()) {
                return "0";
            } else {
                return binary;
            }
        };
        System.out.println(converter.convert(decimal));
    }
}
