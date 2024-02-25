package homework;

public class Main{
    public static void main(String[] args){
        UserReport user = new UserReport(new User("User"));
        user.report();
        user.save();
    }
}