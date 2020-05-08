package structural.facade;

public class Test {
    public static void main(String[] args) {
        Video video = new Video();
        Audio audio = new Audio();

        MediaController controller = MediaController.createController(video, audio);
        System.out.println();

        controller.setToGameMode();
        System.out.println();

        controller.setToMovieMode();
        System.out.println();

        controller.setToMusicMode();
        System.out.println();

        controller.turnOff();
    }
}
