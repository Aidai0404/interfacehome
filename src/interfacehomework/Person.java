package interfacehomework;

public class Person{
 private String names;

    public Person(String names) {
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return  ""+ names;
    }
}
