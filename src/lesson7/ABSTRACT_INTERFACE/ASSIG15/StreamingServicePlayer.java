package lesson7.ABSTRACT_INTERFACE.ASSIG15;

public class StreamingServicePlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing track on streaming service player...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing track on streaming service player...");
    }

    @Override
    public void next() {
        System.out.println("Playing next track on streaming service player...");
    }

    @Override
    public void previous() {
        System.out.println("Playing previous track on streaming service player...");
    }
}
