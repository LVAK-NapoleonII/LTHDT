package ltc4;

public class Square extends Rectangle{

    private double side;
    
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, double width, double height) {
        super(width, height);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    public void setWidth(double side) {
        this.side = side;
    }
    
    public void setHeight(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" + '}';
    }
    
    
}
    
