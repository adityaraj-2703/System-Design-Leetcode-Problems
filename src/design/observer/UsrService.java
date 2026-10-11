package design.observer;

import java.util.ArrayList;
import java.util.List;

public class UsrService {

    private final List<RegisterUsrSubscriber> regUsr = new ArrayList<>();
    private final List<LoginUsrSubscriber> loginUsr = new ArrayList<>();
    private final List<DeleteUsrSubscriber> deleteUsr = new ArrayList<>();

    public void subscribeRegisterUsr(RegisterUsrSubscriber r) {
        this.regUsr.add(r);
    }

    public void unSubscribeRegisterUsr(RegisterUsrSubscriber r) {
        this.regUsr.remove(r);
    }

    public void registerUser(String a, String b) {
        System.out.println("Registering user: " + a + " " + b);
        for (RegisterUsrSubscriber reg : regUsr) {
            reg.handleRegisterUsr();
        }
    }

    public void loginUsr(String a, String b) {

    }

    public void deleteUsr(String a, String b) {

    }
}
