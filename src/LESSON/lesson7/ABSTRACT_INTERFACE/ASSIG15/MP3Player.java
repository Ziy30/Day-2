package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG15;

public class MP3Player implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing track on MP3 player...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing track on MP3 player...");
    }

    @Override
    public void next() {
        System.out.println("Playing next track on MP3 player...");
    }

    @Override
    public void previous() {
        System.out.println("Playing previous track on MP3 player...");
    }
}

