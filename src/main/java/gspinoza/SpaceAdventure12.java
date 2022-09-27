package gspinoza;

    // SAMANTHA is carrying a secret message that should be read by no one else but "James".
    // Create a class with the message and included a method that returns the message to "James" only!
        
public class SpaceAdventure12 {
    
    public static void main(String[] args) {
        // get message for James
        String message = Message.getMessage("James");
        System.out.println(message);

        // try to get message for Danny
        message = Message.getMessage("Danny");
        System.out.println(message);
    }

}


// Message class
class Message {
    // static variables (can be called without having to create an instance of the object)
    public static String name = "James";
    private static String secretMessage = "p.a.s.s.w.o.r.d!";

    // returns message only if name is James
    public static String getMessage(String name) {
        if (name.equals("James")) {
            return secretMessage;
        } else {
            return "you are not allow to see the message";
        }
    }
}