package structural.flyweight;

public class Circle implements Shape{
    private String color;
    private int x;
    private int y;

    public Circle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        // Ekrana ilgili circle'ı çizen kodlar..
        System.out.println("Ekranın " + x + "," + y + " koordinatına " + color + " renginde bir daire çizildi..");
    }
}
