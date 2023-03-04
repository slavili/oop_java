
public class PointMethod {
    static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
    static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(b.x-a.x, 2) + Math.pow(b.y-a.y,2));
    }

    public static void main(String[] args) {

        //Point2D a = new Point2D(0,2);
        Point2D a = new Point2D();
        System.out.println(a.toString());

        Point2D b = new Point2D(30);

        System.out.println(b.toString());

        System.out.println(distance(a, b));

        System.out.println(a.getInfo());
        System.out.println(b.getInfo());
        }
}
