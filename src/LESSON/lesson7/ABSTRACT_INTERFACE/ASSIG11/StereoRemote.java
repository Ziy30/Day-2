package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG11;

public class StereoRemote implements RemoteControl {
    private boolean isOn;
    private int volumeLevel;

    public StereoRemote() {
        isOn = false;
        volumeLevel = 0;
    }

    public void powerOn() {
        isOn = true;
        System.out.println("Stereo system is now turned on.");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("Stereo system is now turned off.");
    }

    public void volumeUp() {
        if (isOn) {
            volumeLevel++;
            System.out.println("Volume increased to level " + volumeLevel);
        } else {
            System.out.println("Stereo system is currently off. Cannot adjust volume.");
        }
    }

    public void volumeDown() {
        if (isOn && volumeLevel > 0) {
            volumeLevel--;
            System.out.println("Volume decreased to level " + volumeLevel);
        } else if (isOn && volumeLevel == 0) {
            System.out.println("Volume is already at the minimum level.");
        } else {
            System.out.println("Stereo system is currently off. Cannot adjust volume.");
        }
    }
}
