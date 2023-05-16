public class Rectangle extends Shape {
    private int lengthRectangle;
    private int widthRectangle;

    public Rectangle(String name, int lengthRectangle, int widthRectangle) {
        super(name);
        this.lengthRectangle = lengthRectangle;
        this.widthRectangle = widthRectangle;
    }
}
