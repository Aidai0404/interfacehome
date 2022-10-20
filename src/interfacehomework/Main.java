package interfacehomework;

public class Main {
    public static void main(String[] args) {
        Person[] fam1=new Person[]{new Person("Pasha"),new Person("Sasha")};
        Family family1=new Family("Malaya Ordynka",fam1);
        Appartement appartement=new Appartement(family1,9873);
        System.out.println(appartement);
        family1.payutilities();

        Person[] fam2={new Person("Demid"),new Person("Nastya")};
        Family family2=new Family("Bol'shaya Ordynka 4k12",fam2);
        Dormitory dormitory=new Dormitory(family2,20500);
        System.out.println(dormitory);
        family2.payrent();


        Person []fami2={new Person("Nicolya"),new Person("Lu-lu"),new Person("Lana")};
        Person [] fami3={new Person("Aila"),new Person("Nathan")};
        Family[] family3 = {new Family("Maroseyka",fami2),new Family("Ust' Ordynka",fami3)};
        Hotel hotel =new Hotel(family3,2300);
        System.out.println(hotel);
        for(Family famin: family3){
                famin.payrent();
            }
        }


        }




