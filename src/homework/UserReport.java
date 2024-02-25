package homework;

public class UserReport {
    public User user;

    public UserReport(User user) {
        this.user = user;
    }




    public void save() {
            System.out.println("Save: " + user.getName());
        }

    }

