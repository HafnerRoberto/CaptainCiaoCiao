import java.awt.*;

public class BermudaTriangle {

    public static int initializePoint(){
      return (int)(Math.random() * 50);
    }

    public static void createTriangle(Polygon triangle){
        for (int i = 0; i < 3; i++){
            triangle.addPoint(initializePoint(), initializePoint());
        }
    }

    public static void printCard (Point ship, Polygon triangle ){
        // print cart
        for (int x = 0; x<50; x++ ){
            System.out.print("\n");
            for(int y = 0; y<50; y++ ){
                //ship
                if(x == ship.x && y == ship.y){
                    System.out.print("S");
                    //rectangle
                } else if(( x==triangle.xpoints[0] && y == triangle.ypoints[0] ) ||
                        ( x==triangle.xpoints[1] && y == triangle.ypoints[1]) ||
                        (x==triangle.xpoints[2] && y == triangle.ypoints[2])) {
                    System.out.print("X");
                }
                else {
                    // wave
                    System.out.print("~");
                }
            }
        }

    }

    public static void main(String[] args) {
        Polygon triangle = new Polygon();
        Point ship = new Point(initializePoint(),initializePoint());
        createTriangle(triangle);

        final String OCTOPUS = "¸\uD83D\uDC19";
        final String RAINBOW =  "\uD83C\uDF08";

        System.out.print(triangle.contains(ship)? OCTOPUS: RAINBOW);
        printCard(ship, triangle );
    }
}
