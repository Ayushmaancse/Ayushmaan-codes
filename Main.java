import java.util.Scanner;

class User {
    void login(String username) {
        System.out.println(username + " logged in as guest.");
    }

    void login(String username, String password) {
        System.out.println(username + " logged in with password.");
    }

    void login(String username, String password, String otp) {
        System.out.println(username + " logged in with 2-factor authentication.");
    }
}
class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Do you want to enter password? (yes/no):");
        String wantPassword = scanner.nextLine();

        if (wantPassword.equalsIgnoreCase("no")) {
            // Only username -> guest login
            user.login(username);

        } else {
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            System.out.println("Do you want to enter OTP? (yes/no):");
            String wantOtp = scanner.nextLine();

            if (wantOtp.equalsIgnoreCase("no")) {
                // Username + password login
                user.login(username, password);

            } else {
                System.out.println("Enter OTP:");
                String otp = scanner.nextLine();

                // Username + password + OTP login
                user.login(username, password, otp);
            }
        }

        scanner.close();
    }
}
