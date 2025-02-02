interface PiValue {
    double getPi();
}

public class LambdaPiExample {
    public static void main(String[] args) {
        PiValue pi = () -> Math.PI;
        
        System.out.println("Value of Pi: " + pi.getPi());
        
        PiValue piWithPrecision = () -> {
            double value = Math.PI;
            return Math.round(value * 10000.0) / 10000.0;
        };
        
        System.out.println("Value of Pi (4 decimal places): " + piWithPrecision.getPi());
        
        PiValue piString = () -> Double.parseDouble(String.format("%.6f", Math.PI));
        
        System.out.println("Value of Pi (6 decimal places): " + piString.getPi());
    }
}