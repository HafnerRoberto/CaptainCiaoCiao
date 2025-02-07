public class SvgCircle3 {
        public static void main ( String [] args){
            int x = 100;
            int y = 110;
            double r = 10 + Math.random() * 20;
            double random = Math.random() * (20 - 10) + 10;
            printXXX(x, y, random);
        }

        public static void printXXX(int x, int y, double r) {
            System.out.printf("<svg height= '100' width= '1000'> \n" +
                    " <circle cx='%d' cy='%d' r='%2f'/> \n" +
                    "</svg>", x,y,r);
        }
}