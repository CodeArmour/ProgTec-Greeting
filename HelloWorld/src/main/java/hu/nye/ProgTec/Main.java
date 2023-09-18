package hu.nye.ProgTec;

public class Main {
    public static void main(String[] args) {
        GreetingService generator = new GreetingService();
        System.out.println(generator.generateGreeting("Miklos"));
    }
}