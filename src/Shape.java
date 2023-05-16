public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class printShapeName  {
    public void printShapeName(Shape shape) {
        System.out.println(shape.getName());
    }
}



