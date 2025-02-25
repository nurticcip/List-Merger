class PasswordException extends Exception{
    public PasswordException(String s) {
        super(s + "\nYour password should be at least 8 characters");
    }
}
public class ExceptionDemo {
    public static void divideByZero (int a, int b){
        System.out.println("Dividing by zero "+a/b);
    }

    public static void login(String username, String password) throws PasswordException {
            if(password.length()<9){
                throw new PasswordException("Invalid Length");
            }

    }
    public static void main(String[] args) {
//        try {
//        divideByZero(10,5);}
//        catch(Exception e){
//            System.out.println("Exception happened");
//        }

        try{
            login("user","user");
        }
        catch(PasswordException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Continue running");
    }


}
