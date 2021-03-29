import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<Shape> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            int parameter = 10 + (int) (Math.random() * 50);
            switch ((int) (Math.random() * 3)){
                case 0:
                    list.add(new Circle(parameter));
                    break;
                case 1:
                    list.add(new Triangle(parameter));
                    break;
                case 2:
                    list.add(new Rectangle(parameter));
                    break;
            }
        }
        Collections.sort(list, (shape1, shape2) -> {
            return (int)(shape2.getArea() - shape1.getArea());
        });
        System.out.println("Square: " + list.get(0).getArea());
        System.out.println("Type: " + list.get(0).getClass());
        System.out.println("Parameter: " + list.get(0).getParameter());
    }
}
