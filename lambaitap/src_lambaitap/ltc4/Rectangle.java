package ltc4;


import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap rong: ");
        width = nhap.nextDouble();
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double Area(){
        return width*height ;
    }
    
    public double Perimeter(){
        return 2*(width+height);
    }

    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    
    
}
