package musical;

public abstract class MusicalInstrument implements Playable {
    private String instrumentClassification;

    public MusicalInstrument(String instrumentClass){
        this.instrumentClassification = instrumentClass;
    }

    public String getInstrumentClassification() {
        return instrumentClassification;
    }

    public void setInstrumentClassification(String instrumentClassificationSetter){
        this.instrumentClassification = instrumentClassificationSetter;
    }
}
