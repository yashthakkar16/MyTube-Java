
public class EmailService implements NotificationServices {
    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }

}
