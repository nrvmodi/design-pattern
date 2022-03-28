package factory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape("circle").draw();
        factory.getShape("rectangle").draw();

    }
}
