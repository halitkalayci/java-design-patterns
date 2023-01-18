package structural.flyweight;

import structural.flyweight.Circle;

import java.util.HashMap;

public class ShapeFactory {

    private static HashMap circleList = new HashMap();

    public static Shape getCircle(String color)
    {
        // Daha önce üretilmiş circle'ları bir alanda tutalım, eğer aynı değer ile üretilmiş bir circle var ise, newlemek yerine bunu dönelim..
        Circle circle = (Circle) circleList.get(color);
        if (circle==null){
            // Kod eğer bu satıra geldiyse.. Daha önce istenilen renkten bir circle üretilmemiş demektir..
            circle = new Circle(color);
            circleList.put(color,circle);
            System.out.println("Var olmadığı için "+ color + " renginde yeni bir circle üretildi..");
        }

        return circle;
    }
}
