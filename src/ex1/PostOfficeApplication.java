package ex1;

import ex2.Postman;

import java.util.ArrayList;

public class PostOfficeApplication {



    public static void main(String[] args) {

        Letter letter = new Letter("Hexstrasse 1.", true);
        PostOfficeAssistant postOfficeAssistant = new PostOfficeAssistant();
        postOfficeAssistant.stamp(letter);
        postOfficeAssistant.send(letter);

        Letter letter1 = new Letter("1",true);
        Letter letter2 = new Letter("2", true);
        Letter letter3 = new Letter("3",true);
        Postman postman = new Postman();
        postman.deliver(letter1);
        postman.deliver(letter2);
        postman.deliver(letter3);


    }

}
