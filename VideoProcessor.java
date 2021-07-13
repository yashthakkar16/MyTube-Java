
public class VideoProcessor {

    private IVideoEncoder encoder;

    private DatabaseServices database;
    private NotificationServices emailService;

    public VideoProcessor(NotificationServices emailService, DatabaseServices database, IVideoEncoder encoder) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {
        encoder.encode(video);

        database.store(video);

        emailService.sendEmail(video.getUser());
    }
}
