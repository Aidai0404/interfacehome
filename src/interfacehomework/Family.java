package interfacehomework;

import java.util.Arrays;

public class Family  implements Pay {

    private String address;

 private Person [] people;




    public Family(String address,Person [] people) {

        this.people=people;
        this.address=address;


    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public void payutilities() {
        System.out.println("Family pays utilities");
    }


    @Override
    public void payrent() {
        System.out.println("Family pays rent");
    }

    @Override
    public String toString() {
        return "\nMembers of family: " + Arrays.toString(people)+
                "\naddress: " + address+
                "\nQuantity of people: "+people.length
                ;
    }
}

