import java.util.TimerTask;
import java.util.Timer;

public class FreeDiskSpaceTimerTask extends TimerTask {

    static final int PERIOD = 2000;
    @Override
    public void run(){
        long freeDiskSpace = java.io.File.listRoots()[0].getFreeSpace();
        if(freeDiskSpace > 0){
            System.out.println(freeDiskSpace);
        }
    }

    public static void main(String[] args) {
        FreeDiskSpaceTimerTask freeDiskSpaceTimerTask = new FreeDiskSpaceTimerTask();
        Timer timer = new Timer();

        timer.schedule(freeDiskSpaceTimerTask,0 ,PERIOD );

    }

}
