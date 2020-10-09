package musical;

public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private int numberOfKeys;

    public Piano(String instrumentClass, int numberOfKeys) {
        super(instrumentClass);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int newKeys) {
        this.numberOfKeys = newKeys;
    }

    @Override
    public void startMusic() {
        System.out.println("Starting to play the Piano...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopped playing the Piano...");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Tuning your Piano. \nYour Piano is tuned");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Detuning your Piano. \nYour Piano is out of tune.");
    }

    @Override
    public void volumeUp() {
        System.out.println("Turning up the volume on your Piano.");
    }

    @Override
    public void volumeDown() {
        System.out.println("Turning down the volume on your Piano.");
    }
}
