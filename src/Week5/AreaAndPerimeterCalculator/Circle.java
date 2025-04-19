package Week5.AreaAndPerimeterCalculator;

public class Circle extends Shape{
    public Circle(int dimension) {
        super(dimension);
    }

    @Override
    public double calculateArea() {
        return dimension * dimension * 3.14;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * dimension;
    }

    public void Circle() {
        System.out.println("Circle");
        System.out.println("Dimension : " + dimension);
        System.out.println("Perimeter : " + calculatePerimeter());
        System.out.println("Area : " + calculateArea());
        System.out.println();
    }
}
