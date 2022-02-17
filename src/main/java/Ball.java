public class Ball {
    private float xCoordinate;
    private float yCoordinate;
    private float diameter;

    public Ball(float xCoordinate, float yCoordinate, float diameter) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.diameter = diameter;
    }

    public float getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(float xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void changeXCoordinateBy(float delta) {
        this.xCoordinate = this.xCoordinate + delta;
    }

    public float getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(float yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void changeYCoordinateBy(float delta) {
        this.yCoordinate = this.yCoordinate + delta;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public void changeDiameterBy(float delta) {
        this.diameter = this.diameter + delta;
    }
}
