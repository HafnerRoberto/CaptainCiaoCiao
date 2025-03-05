import java.util.Objects;

public class Radio {

    public enum Modulation {
        AM, FM
    }

    private static final double MIN_AM_FREQUENCE = 148.5 * 1000;
    private static final double MAX_AM_FREQUENCE = 26.1  * 1000000 ;

    private static final double MIN_FM_FREQUENCE = 87.5 * 1000000;
    private static final double MAX_FM_FREQUENCE = 108.0 * 1000000;
    //
    private double minFrequency = MIN_AM_FREQUENCE;
    private double maxFrequence = MAX_AM_FREQUENCE;

    private Modulation modulation = Modulation.AM;

    public void setModulation (Modulation modulation){
        this.modulation = Objects.requireNonNull(modulation);
        //
        minFrequency = (modulation == Modulation.AM ? MIN_AM_FREQUENCE: MIN_FM_FREQUENCE);
        maxFrequence = modulation == Modulation.AM ? MAX_AM_FREQUENCE: MAX_FM_FREQUENCE;
    }
}
