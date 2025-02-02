class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class MyException {
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new CustomException("Age cannot be negative!");
            }
        } catch (CustomException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}