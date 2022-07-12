package level1;
import java.lang.Math;

public class Triangle {

    private class Point{
        private int x;
        private int y;

        private Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    Point x1 = new Point(1,4);
    Point x2 = new Point(5,9);
    Point x3 = new Point(2,5);

    public double Square(){
        double a = Math.sqrt((x1.x - x2.x) * (x1.x - x2.x) + (x1.y - x2.y) * (x1.y - x2.y));
        double b = Math.sqrt((x1.x - x3.x) * (x1.x - x3.x) + (x1.y - x3.y) * (x1.y - x3.y));
        double c = Math.sqrt((x2.x - x3.x) * (x2.x - x3.x) + (x2.y - x3.y) * (x2.y - x3.y));
        double p = (a + b + c) / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }

}
