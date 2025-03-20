class DistanceImplementation implements Distance{
    private final int value;

    DistanceImplementation(int value){
        this.value = value;
    }

    @Override
    public int meter() {
        return this.value;
    }

    @Override
    public int kilometer() {
        return Distance.super.kilometer();
    }
}




public interface Distance {
    public static Distance ofMeter(int value){
        return new DistanceImplementation(value) {
        };
    }

    public static Distance ofKilometer(int value){
        return new DistanceImplementation(value * 1000);
    }

    public abstract int meter();

    public default int kilometer() {
        return meter() / 1000;
    }
}
