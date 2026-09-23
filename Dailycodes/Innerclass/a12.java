


class LoginSystem {
    void login() {

        class Validator {
            int password = 1234321;
            String userName = "Pratiksha";

            void info() {
                System.out.println(password);
                System.out.println(userName);
            }
        }

        Validator obj = new Validator();
        obj.info();
    }

    public static void main(String[] args) {
        LoginSystem obj = new LoginSystem();
        obj.login();
    }
}