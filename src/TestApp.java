public class TestApp {

    public static void main(String[] args) {
        User user = new User("Meriem", "Stagiaire");
        Calculator calc = new Calculator();

        user.displayInfo();
        Utils.printSeparator();

        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Soustraction: " + calc.subtract(10, 4));
    }
}
