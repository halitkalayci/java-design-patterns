package structural.flyweight;

public class Main {
    private static final String colors[] = { "Kırmızı","Siyah","Beyaz","Mavi","Yeşil" };
    public static void main(String[] args) {
        for(int i=0; i<200; i++){
            String color = getRandomColor();
            Circle circle = (Circle) ShapeFactory.getCircle(color);
            circle.setX(getRandomCoordinate());
            circle.setY(getRandomCoordinate());
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random() * colors.length)];
    }

    private static int getRandomCoordinate(){
        return (int)(Math.random() * 100);
    }
}
