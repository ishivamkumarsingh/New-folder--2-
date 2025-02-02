abstract class Shape {
    // Abstract method to draw the shape
    public abstract void draw();
    
    // Method to calculate area
    public double calculateArea() {
        return 0.0;
    }
}

// Circle class inheriting from Shape
class Circle extends Shape {
    protected double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Cylinder class inheriting from Circle
class Cylinder extends Circle {
    private double height;
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a Cylinder with radius: " + radius + 
                         " and height: " + height);
    }
    
    @Override
    public double calculateArea() {
        // Total surface area = 2πr² + 2πrh
        // (2 circular faces + lateral surface area)
        double circularArea = 2 * Math.PI * radius * radius;
        double lateralArea = 2 * Math.PI * radius * height;
        return circularArea + lateralArea;
    }
}

// Main class to demonstrate the implementation
class Poly {
    public static void main(String[] args) {
        // Create instances of Circle and Cylinder
        Circle circle = new Circle(5.0);
        Cylinder cylinder = new Cylinder(3.0, 4.0);
        
        // Demonstrate Circle
        System.out.println("Circle:");
        circle.draw();
        System.out.printf("Circle Area: %.2f square units%n", 
                         circle.calculateArea());
        
        System.out.println("\nCylinder:");
        cylinder.draw();
        System.out.printf("Cylinder Surface Area: %.2f square units%n", 
                         cylinder.calculateArea());
    }
}