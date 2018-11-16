package ex2;

import ex1.Letter;

import java.util.ArrayList;

public class Postman {

    public Postman(){}


    public ArrayList deliver(Letter letter){
        ArrayList<Letter> letterList = new ArrayList<>();
        for(Letter: letterList) {
            System.out.println("I delivered it to its adress.");
            letterList.removeAll(letterList);
        }
        return letterList;


    }




}
