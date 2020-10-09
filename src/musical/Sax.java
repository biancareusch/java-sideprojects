package musical;

public class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private String saxType;

    public Sax(String instrumentClass, String saxType) {
        super(instrumentClass);
        this.saxType = saxType;
    }

    public String getSaxType() {
        return saxType;
    }

    public void setSaxType(String newSaxType) {
        this.saxType = newSaxType;
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Tuning your Sax. \nYour Sax is tuned");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Detuning your Sax. \nYour Sax is out of tune.");
    }

    @Override
    public void volumeUp() {
        System.out.println("Turning up the volume on your Sax.");
    }

    @Override
    public void volumeDown() {
        System.out.println("Turning down the volume on your Sax.");
    }

    @Override
    public void startMusic() {
        System.out.println("Starting to play the Sax...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopped playing the Sax.");
    }
}
