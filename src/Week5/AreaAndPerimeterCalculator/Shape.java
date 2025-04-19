package Week5.AreaAndPerimeterCalculator;

public abstract class Shape {
    protected int dimension;

    public Shape(int dimension) {
        this.dimension = dimension;
    }
    public int getDimension() {
        return dimension;
    }
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
