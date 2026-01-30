public class User {

    private String name;
    private String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
    }
    public void greet() {
    System.out.println("Bienvenue dans l'application");
}

public boolean isAdmin() {
        return role.equalsIgnoreCase("admin");
    }
}
