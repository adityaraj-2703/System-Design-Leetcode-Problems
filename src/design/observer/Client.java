package design.observer;

public class Client {
    public static void main(String[] args) {
        UsrService u = new UsrService();
        String a = "aditya";
        String b = "raj";

        EmailManageManagementService e = new EmailManageManagementService(u);
        u.registerUser(a, b);
    }
}
