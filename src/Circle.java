public class Circle implements Shape {

    private int radius;

    public Circle(int _radius){
        radius = _radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public int getParameter() {
        return radius;
    }
}
