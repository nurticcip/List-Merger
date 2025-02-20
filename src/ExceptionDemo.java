public class ExceptionDemo {
    public static void divideByZero (int a, int b) throws Exception{

        System.out.println("Dividing by zero "+a/b);

    //System.out.println("Can't divide by zero. Reenter new b");

    }
    public static void main(String[] args) {
        try {
        divideByZero(10,5);}
        catch(Exception e){
            System.out.println("Exception happened");
        }
        System.out.println("Continue running");
    }
}
