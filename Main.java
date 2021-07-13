
public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        var processor = new VideoProcessor(new EmailService(), new VideoDatabase(), new VideoEncoder());

        processor.process(video);
    }
}
