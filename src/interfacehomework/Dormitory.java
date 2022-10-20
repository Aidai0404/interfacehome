package interfacehomework;

public class Dormitory {
   private Family family2;
   private int rent;

    public Dormitory(Family family2,int rent) {

        this.family2=family2;
        this.rent=rent;
    }

    public Family getFamily2() {
        return family2;
    }

    public void setFamily2(Family family2) {
        this.family2 = family2;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "\nDormitory:" +
                "\nRental price per month: "+rent+
                "\nMembers of family: " + family2;
    }
}
