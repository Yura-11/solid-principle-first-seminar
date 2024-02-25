package homework;

public class Main{
    public static void main(String[] args){
        UserReport user = new UserReport(new User("User"));
        Persister user1 = new Persister(new User("User"));
        Persister.report();
        user.save();
    }
}