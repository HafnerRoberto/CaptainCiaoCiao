public class Trace {
    private static boolean tracingIsOn = false;

    public static void trace (String string){
        if (tracingIsOn){
            System.out.println(string);
        }

    }

    public static void on(){
        tracingIsOn = true;
    }
    public static void off(){
        tracingIsOn = false;
    }

}
