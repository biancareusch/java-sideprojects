package musical;

public class MusicTest {
    private static Tuneable tuneableObj;
    private static VolumeAdjustable va;

    public static void main(String[] args) {

Tuneable firstPiano = new Piano("strings",60);
VolumeAdjustable firstSax = new Sax("brass","baritone");


firstPiano.tuneInstrument();





//        public static void detuneRetune(Tuneable tuneableObj) {
//            tuneableObj.detuneInstrument();
//            tuneableObj.tuneInstrument();
//        }
//
//        public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
//            va.volumeUp();
//            va.volumeDown();
//            va.volumeUp();
//            va.volumeDown();
//        }

    }
}
