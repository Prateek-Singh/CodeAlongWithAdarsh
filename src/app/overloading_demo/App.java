package app.overloading_demo;

public class App {

    public String greet(String firstName) {
        return greet(firstName, "Singh", 21);
    }

    public String greet(String firstName, String lastName) {
        return greet(firstName, lastName, 21);
    }

    public String greet(String firstName, String lastName, int age) {
        return String.format("Hello %s %s age: %d Welcome to Overloading demo!", firstName, lastName, age);
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.greet("Adarsh"));
        System.out.println(app.greet("Adarsh", "Singh"));
        System.out.println(app.greet("Adarsh", "Singh", 21));
    }

}