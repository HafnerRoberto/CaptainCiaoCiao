public class SVGRectangleRotate {
    public static void main (String [] args){
        System.out.print("<svg height= '200' width= '200'> \n");
        for (int rotation = 0;rotation <36; rotation++){
            System.out.printf("<rect x = '50' y = '50' width = 100> heigth = '100' stroke= 'black'" +
                    "fill= 'none' transform = 'rotate(%d 100 100)'\n ",rotation * 10);
        }
        System.out.print("<svg/>");

    }
}
