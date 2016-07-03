package Turtle1;
//RANDOM THING NOT VERY USEFUL
public class KochSnowFlake1 {
    private Turtle turtle;      // for turtle graphics
    private double size;        // size of each line segment

    public KochSnowFlake1(int N) {
        int width = 512;
        int height = (int) (2 * width / Math.sqrt(3));
        size = width / Math.pow(3.0, N);
        turtle = new Turtle(0, width * Math.sqrt(3) / 2, 0.0);
        turtle.setCanvasSize(width, height);
        turtle.setXscale(0, width);
        turtle.setYscale(0, height);

        // three Koch curves in the shape of an equilateral triangle
        koch(N);
        turtle.turnLeft(-120);
        koch(N);
        turtle.turnLeft(-120);
        koch(N);
    }

    public void koch(int n) {
        if (n == 0) {
            turtle.goForward(size);
        }
        else {
            koch(n-1);
            turtle.turnLeft(60);
            koch(n-1);
            turtle.turnLeft(-120);
            koch(n-1);
            turtle.turnLeft(60);
            koch(n-1);
        }
    }

    public static void main(String[] args) {
        new KochSnowFlake1(6);
    }
}
