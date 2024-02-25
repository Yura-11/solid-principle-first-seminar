package homework;

import static java.lang.System.out;

public class Persister{
    public static User user;

    public Persister(User user) {
        this.user = user;
    }

    public static void report() {
        out.println("Report for user: " + user.getName());
    }

}
