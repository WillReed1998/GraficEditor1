public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 5);
        Shape hexagon = new Hexagon("Hexagon", 5);
        Shape quad = new Quad("Quad", 5);
        Shape rectangle = new Rectangle("Rectangle", 5, 6);
        Shape triangle = new Triangle("Triangle", 5, 6);
        printShapeName printer = new printShapeName();
        printer.printShapeName(circle);
        printer.printShapeName(hexagon);
        printer.printShapeName(quad);
        printer.printShapeName(rectangle);
        printer.printShapeName(triangle);
    }
}
