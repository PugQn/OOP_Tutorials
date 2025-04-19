package Week5.AreaAndPerimeterCalculator;

public class Square extends Shape{

    public Square(int dimension) {
        super(dimension);
    }

    @Override
    public double calculateArea() {
        return dimension * dimension;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * dimension;
    }

    public void Square() {
        System.out.println("Square");
        System.out.println("Dimension : " + dimension);
        System.out.println("Perimeter : " + calculatePerimeter());
        System.out.println("Area : " + calculateArea());
        System.out.println();
    }
}
