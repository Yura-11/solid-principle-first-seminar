package homework;

public class Main{
    public static void main(String[] args){
        UserReport user = new UserReport(new User("User"), new Persister());
        user.report();
        user.save();
    }
}