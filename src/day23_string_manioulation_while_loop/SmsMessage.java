package day23_string_manioulation_while_loop;

public class SmsMessage {
    public static void main(String[] args) {
        String message = "Sender: [Nadir] From Number<+1(222) 333-4444> " +
                "Message:{Hello, let's code some java}";

        //substring, indexOf
       // indexOf will find index numbers of the special characters: [,],<>,{}

        System.out.println(message.indexOf("["));
        System.out.println(message.indexOf("]"));
        System.out.println(message.substring(message.indexOf("[")+1, message.indexOf("]")));

        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start + 1, end));
        String sender = message.substring(start + 1, end);
        System.out.println("sender = " + sender);
        
        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobile = " + mobile);
        String text = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("text = " + text);

        if (sender.equals("Nadir")) {
            System.out.println("message from Nadir about homework");
        } else {
            System.out.println("Message from someone else");
        }
        System.out.println(" s q l ".trim());
        sender = sender.trim();


    }
}

