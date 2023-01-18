package structural.decorator;

public class ShapeColorDecorator extends ShapeDecorator{
    public ShapeColorDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setColorToRed();
        getColorAndLog();
    }
    private void setColorToRed(){
        System.out.println("Shape color changed to red..");
    }
    public void getColorAndLog(){
        System.out.println("This shapes color is red");
    }
}
