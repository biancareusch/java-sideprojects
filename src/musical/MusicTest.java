package musical;

public class MusicTest {
//    private static Tuneable tuneableObj;
//    private static VolumeAdjustable va;

    public static void main(String[] args) {

        MusicalInstrument firstPiano = new Piano("strings", 60);
        Tuneable firstSax = new Sax("brass", "baritone");
        VolumeAdjustable volPiano = new Piano("strings", 90);
        Piano allPiano = new Piano("strings",45);

        //firstPiano of the type MusicalInstrument can access the implementations of class MusicalInstrument(playable)
        firstPiano.getInstrumentClassification();
        firstPiano.setInstrumentClassification("something");
        firstPiano.startMusic();
        firstPiano.stopMusic();


        //firstSax of type Tuneable has the implementations made in Sax class to access the tune methods
        firstSax.tuneInstrument();
        firstSax.detuneInstrument();

        //volPiano of type VolumeAdjustable can access the pianos implementations of the interface volumeAdjustables' method
        volPiano.volumeUp();
        volPiano.volumeDown();

        //allPiano of type Piano can access all interfaces because it inherits playable from musicalInstruments
        // and its own implementation of tuneable and volumeadjustable
        allPiano.volumeUp();
        allPiano.volumeDown();
        allPiano.tuneInstrument();
        allPiano.detuneInstrument();
        allPiano.startMusic();
        allPiano.stopMusic();



//      Create an abstract class called ```MusicalInstrument``` that implements a ```Playable``` interface.
//
//```MusicalInstrument``` should have a constructor that sets the value of a private string field of ```instrumentClassification``` (include getter and setter)
//
//The ```Playable``` interface contains the following method definitions:
//
//    public void startMusic();
//    public void stopMusic();
//
//Create a ```Tuneable``` interface with the following method definitions:
//
//    public void tuneInstrument();
//    public void detuneInstrument();
//
//Create a ```VolumeAdjustable``` interface with the following method definitions:
//
//    public void volumeUp();
//    public void volumeDown();
//
//Create ```Piano``` and ```Sax``` classes that both extend from ```MusicInstrument``` and implement ```Tuneable``` and ```VolumeAdjustable```.
//
//For both ```Piano``` and ```Sax``` classes, implement all needed methods by sout'ing out messages that make sense.
//
//The ```Piano``` class should also include a private int field of ```numberOfKeys``` (update your constructor and add a getter and setter)
//
//The ```Sax``` class should also include a private int string field of ```saxType``` (update your constructor and add a getter and setter)
//
//Create a ```MusicTest``` class with a main method to practice instantiating ```Piano``` and ```Sax``` objects of type ```Piano``` and ```Sax``` or the types of the Interfaces they implement. Add the following two methods to the ```MusicTest``` class to experiement with various instances of the ```Piano``` and ```Sax``` objects:
//
//  	public static void detuneRetune(Tuneable tuneableObj) {
//        tuneableObj.detuneInstrument();
//        tuneableObj.tuneInstrument();
//    }
//
//    public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
//        va.volumeUp();
//        va.volumeDown();
//        va.volumeUp();
//        va.volumeDown();
//    }

    }
}
