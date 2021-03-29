public class Triangle implements Shape {

    private int side;

    public Triangle(int _side){
        side = _side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3)/4)*side*side;
    }

    @Override
    public int getParameter() {
        return side;
    }
}
