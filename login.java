import java.util.*;

public class LoginSystem {

    // Store username and password in a HashMap
    private static Map<String, String> users = new HashMap<>();

    // Method to register a new user
    public static void register(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("Username already exists! ❌");
        } else {
            users.put(username, password);
            System.out.println("User registered successfully ✅");
        }
    }

    // Method to login
    public static boolean login(String username, String password) {
        if (!users.containsKey(username)) {
            System.out.println("No such user found! 🚫");
            return false;
        }
        if (users.get(username).equals(password)) {
            System.out.println("Login successful 🎉 Welcome, " + username + "!");
            return true;
        } else {
            System.out.println("Incorrect password ❌");
            return false;
        }
    }

    // Main method to test login
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Register a few users
        register("sagar", "12345");
        register("admin", "admin123");

        System.out.print("\nEnter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        login(user, pass);

        sc.close();
    }
}
