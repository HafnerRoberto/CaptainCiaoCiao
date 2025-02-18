import java.awt.*;

public class Distance {
    static double minDistance (Point [] points, int size){
        if (points == null) throw new NullPointerException();
        double distance = 0.0;
        for (int i = 0; i < size; i++){
            if(points[i] == null) throw new NullPointerException();
            double result = points[i].distance(0.0, 0.0);
            if (i == 0){
                distance = result;
            }
            else if (result <= distance){
                distance = result;
            }
        }
        return distance;
    }


    public static void main(String[] args) {
        Point [] points = { new Point(10,20), new Point(12,2), new Point(44,4)};
        double distance = 0.0;
        try {
            distance = minDistance (points, points.length);
        } catch (Exception e){
            System.out.println("null");
        }
        System.out.println(distance);
    }
}
