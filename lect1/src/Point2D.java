public class Point2D {
    int x, y;
    public Point2D(int valueX, int valueY){
        this.x = valueX;
        this.y = valueY;
    }
    public Point2D(int value){
        this(value, value);
    }
    public Point2D(){
        this(0);
    }

    public String getInfo(){
        return String.format("x: %d, y: %d", this.x, this.y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
