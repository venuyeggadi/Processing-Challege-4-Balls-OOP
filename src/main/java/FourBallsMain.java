import processing.core.PApplet;

public class FourBallsMain extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public Ball[] balls;

    public static void main(String[] args) {
        PApplet.main("FourBallsMain", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        balls = new Ball[4];
        for(int index = 0; index < 4; index++) {
            float yCoordinate = (index + 1f) * HEIGHT / 5;
            balls[index] = new Ball(0, yCoordinate, 10);
        }
    }

    @Override
    public void draw() {
        for(int index = 0; index < 4; index++) {
            drawCircle(balls[index].getXCoordinate(), balls[index].getYCoordinate(), balls[index].getDiameter());
            balls[index].changeXCoordinateBy(index + 1);
        }
    }

    public void drawCircle(float xCoordinate, float yCoordinate, float diameter) {
        ellipse(xCoordinate, yCoordinate, diameter, diameter);
    }
}