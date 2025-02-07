public class SvgCircle2 {
        public static void main ( String [] args){
            int x = 100;
            int y = 110;
            double r = 20.5;
            printXXX(x, y, r);
        }

        public static void printXXX(int x, int y, double r) {
            System.out.printf("<svg height= '100' width= '1000'> \n" +
                    " <circle cx='%d' cy='%d' r='%f'/> \n" +
                    "</svg>", x,y,r);
        }
}