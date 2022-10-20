package interfacehomework;

import java.util.Arrays;

public class Hotel  {
    private Family []family3;
    private int rent;


    public Hotel(Family[] family3,int rent) {
        this.family3=family3;
        this.rent=rent;
    }

    public Family [] getFamily3() {
        return family3;
    }

    public void setFamily3(Family[] family3) {
        this.family3 = family3;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "\nHotel: " +
                "\nRental price per day: " + rent+
                "\nQuantity of families: " +family3.length+"\n"+
                Arrays.toString(family3);
    }


}
