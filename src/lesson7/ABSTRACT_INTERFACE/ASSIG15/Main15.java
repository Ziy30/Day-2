package lesson7.ABSTRACT_INTERFACE.ASSIG15;

public class Main15 {
    public static void main(String[] args) {
        // Test MP3Player
        MusicPlayer mp3Player = new MP3Player();
        mp3Player.play();
        mp3Player.pause();
        mp3Player.next();
        mp3Player.previous();

        // Test StreamingServicePlayer
        MusicPlayer streamingPlayer = new StreamingServicePlayer();
        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.next();
        streamingPlayer.previous();
    }
}
