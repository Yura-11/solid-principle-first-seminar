package homework;

import static java.lang.System.out;

public class UserReport {
    public User user;


    public UserReport(User user) {
        this.user = user;

    }


    public void save() {
        System.out.println("Save: " + user.getName());
    }


    public void report() {
        out.println("Report for user: " + user.getName());
    }
}
