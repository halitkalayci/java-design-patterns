package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Shape rectangle1 = new ShapeColorDecorator(new Rectangle());
        rectangle1.draw();
    }
}
