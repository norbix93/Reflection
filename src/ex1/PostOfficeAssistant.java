package ex1;

public class PostOfficeAssistant {

    public PostOfficeAssistant(){}

    public void stamp(Letter letter){
        letter.stamp();
    }
    public void send(Letter letter){
        if (letter.isStamped()){
            System.out.println("We will send it to the address.");
        }
        else
            System.out.println("We need to stamp it first.");
    }


}
