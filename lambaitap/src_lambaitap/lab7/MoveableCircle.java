/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author kle47
 */
public class MoveableCircle implements Moveable {

    public int radius;
    public MoveablePoint center;

    @Override
    public void moveUp() {
    }

    @Override
    public void moveDown() {
    }

    public MoveableCircle(int radius, MoveablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MoveableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }

    @Override
    public void moveRight() {
    }

    @Override
    public void moveLeft() {
    }

    class MoveablePoint {

        int x, y, xSpeed, ySpeed;

        public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public String toString() {
            return "MoveablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
        }

        public void moveUp() {
        }

        public void moveDown() {
        }

        public void moveLeft() {
        }

        public void moveRight() {
        }
    }
}
