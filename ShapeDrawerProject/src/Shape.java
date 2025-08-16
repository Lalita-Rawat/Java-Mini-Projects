// Abstract Class - Shape
public abstract class Shape {
    private String name;

    public Shape(String name) throws Exception {
        if (name == null || name.isEmpty()) {
            throw new Exception("Shape name cannot be null or empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void draw();
}
