/**
 * This is 2D point
 */
public class Point2D {
    private int x, y;

    /**
     * This is the constructor
     * @param valueX
     * @param valueY
     */
    public Point2D(int valueX, int valueY){
        this.x = valueX;
        this.y = valueY;
    }

    /**
     * This is constructor
     * @param value
     */
    public Point2D(int value){
        this(value, value);
    }

    /**
     * This is constructor
     */
    public Point2D(){
        this(0);
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    public String getInfo(){
        return String.format("x: %d, y: %d", this.x, this.y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
