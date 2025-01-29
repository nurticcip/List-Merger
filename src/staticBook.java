public class staticBook {
    String title;
    String author;
    int numberOfPages;
    static String owner;

    public staticBook(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public staticBook(){}

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        staticBook.owner = owner;
    }

    public String toString(){
        return this.title + " " + this.author + " " + this.getOwner();
    }

    public static void resetOwner(){
        owner = "";
    }

    public static void main(String[] args) {
        staticBook b1 = new staticBook();
        staticBook b2 = new staticBook("HP", "Rowling",700);

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        b1.setOwner("AIT");
        staticBook.owner = "TA";
        System.out.println(b1);
        System.out.println(b2);
        staticBook.resetOwner();
        System.out.println(b2);
    }
}
