package Week5.AreaAndPerimeterCalculator;

public class Triangle extends Shape{
    public Triangle(int dimension) {
        super(dimension);
    }

    @Override
    public double calculateArea() {
        return 0.433 * dimension * dimension;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * dimension;
    }

    public void Triangle() {
        System.out.println("Triangle");
        System.out.println("Dimension : " + dimension);
        System.out.println("Perimeter : " + calculatePerimeter());
        System.out.println("Area : " + calculateArea());
        System.out.println();
    }
}
