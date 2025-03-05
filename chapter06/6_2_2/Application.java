public class Application {
    public static void main(String[] args) {
        //cause static -> Math.
        Trace.on();
        Trace.trace("Start");
        int i = 2;
        Trace.off();
        Trace.trace("i = " + i);
        Trace.on();
        Trace.trace("End");
    }
}
