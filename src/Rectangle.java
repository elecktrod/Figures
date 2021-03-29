public class Rectangle implements Shape{

    private int side;

    public Rectangle(int _side){
        side = _side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public int getParameter() {
        return side;
    }
}
