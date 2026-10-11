package design.observer;

public class EmailManageManagementService implements RegisterUsrSubscriber {

    private void sendEmail(String to, String from) {
        System.out.println("Sending email from " + from + " to " + to);
    }

    private final UsrService usrService;

    public EmailManageManagementService(UsrService usrService) {
        this.usrService = usrService;
        this.usrService.subscribeRegisterUsr(this);
    }

    @Override
    public void handleRegisterUsr() {
        sendEmail("abc", "deg");
    }
}
