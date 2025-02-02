interface Rectangle {
    double calculateArea(double length, double width);
}

public class Rect {
    public static void main(String[] args) {
        Rectangle area = Rect::calculateRectangleArea;
        double length = 5.0;
        double width = 3.0;
        double result = area.calculateArea(length, width);
        System.out.println("The area of the rectangle is: " + result);
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}