package structural.facade;

public class MediaController {
    private Video video;
    private Audio audio;

    private static MediaController mediaController;     // Facade is normally a singleton

    private MediaController(Video video, Audio audio) {
        System.out.println("Initializing system.");
        this.video = video;
        this.audio = audio;
    }

    public static MediaController createController(Video video, Audio audio) {
        if (mediaController == null) {
            mediaController = new MediaController(video, audio);
        }

        return mediaController;
    }

    public void setToGameMode() {
        System.out.println("Media is set to game mode.");
        this.video.setToMedium();
        this.audio.setToMedium();
    }

    public void setToMusicMode() {
        System.out.println("Media is set to music mode.");
        this.video.setToLow();
        this.audio.setToHigh();
    }

    public void setToMovieMode() {
        System.out.println("Media is set to movie mode.");
        this.video.setToHigh();
        this.audio.setToMedium();
    }

    public void turnOff() {
        System.out.println("Media is off.");
        this.video.turnOff();
        this.audio.turnOff();
    }
}
