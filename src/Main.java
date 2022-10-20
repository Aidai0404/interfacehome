public class Main {
    public static void main(String[] args) {
        Swimable[] oceanarium = {new Shark(), new Duck(), new Turtle()};
        for(Swimable ocean: oceanarium){
       ocean.swim();
    }
}}