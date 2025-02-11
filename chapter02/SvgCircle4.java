public class SvgCircle4 {
    public static void main ( String [] args){
        String fill = "";
        double full =  Math.random();
        // 1 - 33 = blue
        // 34 - 66 = red
        // 67 - 100 = green
        if (full <= 0.33){
            fill = "blue";
        } else if (full <= 0.66){
            fill = "red";
        } else {
            fill = "green";
        }
        printXXX(fill);
    }

    public static void printXXX(String fill) {
        System.out.printf("<svg height= '100' width= '1000'> \n" +
                " <circle cx='20' cy='20' r='5' fill = '%s'/> \n" +
                "</svg>", fill);
    }
}
