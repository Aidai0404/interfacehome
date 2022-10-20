package interfacehomework;

public class Appartement{


   private Family family7;
  private int utilities;

    public Appartement( Family family7,int utilities) {
        this.family7=family7;
      this.utilities=utilities;


    }

    public Family getFamily7() {
        return family7;
    }

    public void setFamily7(Family family1) {
        this.family7 = family7;
    }

    public int getUtilities() {
        return utilities;
    }

    public void setUtilities(int utilities) {
        this.utilities = utilities;
    }

    @Override
    public String toString() {
        return "Appartement: " +
                "\nUtility's price: "+utilities+" rubles"+
                "\nMembers of family:  " + family7;
    }



}
