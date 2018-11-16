package ex1;

public class Letter {

    private String address;
    private Boolean stamped;

    public Letter(String address, Boolean stamped) {
        this.address=address;
        this.stamped=stamped;
    }

    public Boolean isStamped(){
        if (stamped){
            return true;
        }
        return false;
        
    }

    public Boolean stamp(){
        return stamped;
    }

    public String getAddress(String address){
        return address;
    }



}
