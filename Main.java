// Parent class
class User {
    void accessDashboard() {
        System.out.println("Accessing basic user dashboard...");
    }
}

// Subclass: Admin user
class AdminUser extends User {
    @Override
    void accessDashboard() {
        System.out.println("Accessing Admin Dashboard with full privileges.");
    }
}

// Subclass: Customer user
class CustomerUser extends User {
    @Override
    void accessDashboard() {
        System.out.println("Accessing Customer Dashboard with purchase options.");
    }
}

// Subclass: Guest user
class GuestUser extends User {
    @Override
    void accessDashboard() {
        System.out.println("Accessing Guest Dashboard with limited access.");
    }
}

// Main class to demonstrate runtime polymorphism
class App {
    public static void main(String[] args) {
        User user;

        user = new AdminUser();
        user.accessDashboard();  // Output: Accessing Admin Dashboard...

        user = new CustomerUser();
        user.accessDashboard();  // Output: Accessing Customer Dashboard...

        user = new GuestUser();
        user.accessDashboard();  // Output: Accessing Guest Dashboard...
    }
}