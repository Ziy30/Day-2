package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG11;

public class Main11 {
    public static void main(String[] args) {
        // Test TVRemote
        RemoteControl tvRemote = new TVRemote();
        tvRemote.powerOn();
        tvRemote.volumeUp();
        tvRemote.volumeUp();
        tvRemote.volumeDown();
        tvRemote.powerOff();

        // Test StereoRemote
        RemoteControl stereoRemote = new StereoRemote();
        stereoRemote.powerOn();
        stereoRemote.volumeUp();
        stereoRemote.volumeDown();
        stereoRemote.powerOff();
    }
}
