import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side: ");
        int side = scanner.nextInt();
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        System.out.print("Enter radius: ");
        double radius = scanner.nextInt();

        calculateArea(side);
        calculateArea(length, width);
        calculateArea(radius);

        scanner.close();
    }

    static void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of square: " + area);
    }

    static void calculateArea(int length, int width) {
        int area = length * width;
        System.out.println("Area of rectangle: " + area);
    }

    static void calculateArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(String.format("Area of circle: %.2f", area));
    }

}
