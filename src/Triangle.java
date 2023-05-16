public class Triangle extends Shape {
    private int baseTriangle;
    private int heightTriangle;

    public Triangle(String name, int baseTriangle, int heightTriangle) {
        super(name);
        this.baseTriangle = baseTriangle;
        this.heightTriangle = heightTriangle;
    }
}