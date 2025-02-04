import java.util.Objects;
import java.util.Scanner;

public class Kniga {
    private String author;
    private String title;
    private boolean isAvailable;

    public Kniga(String author, String title, boolean isAvailable) {
        this.author = author;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Kniga kniga = (Kniga) o;
        return (this.getTitle().equals(kniga.title) &&
                this.getAuthor().equals(kniga.author));
        //return Objects.equals(getAuthor(), kniga.getAuthor()) && Objects.equals(getTitle(), kniga.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getTitle());
    }
}

class Library{
    Kniga[] books;
    int indexFree;

    public Library() {
        this.books = new Kniga[10];
        this.indexFree = 0;
    }

    public void addBook(String author, String title){
        if(indexFree < 10){
            Kniga k = new Kniga(author, title, true);
            books[indexFree] = k;
            indexFree++;
        }
        else{
            System.out.println("Library is full. A book can not be added");
        }
    }

    public void addBook(Kniga book){
        if(indexFree < 10) {
            books[indexFree] = book;
            indexFree++;
        }
        else{System.out.println("Library is full. A book can not be added");}

    }

    public void borrowBook(String author, String title){
        for(Kniga k: books){
            if(k != null){
                if(k.getAuthor().equals(author)  && k.getTitle().equals(title)){
                    k.setAvailable(false);
                }
            }
            else{
                break;
            }

        }
    }

    public void returnBook(String author, String title){
        for(Kniga k:books){
            if(k!=null){
                if(k.getTitle().equals(title) && k.getAuthor().equals(author)){
                    k.setAvailable(true);
                }
            }
            else{
                break;
            }
        }
    }

    public void showBooks(){
        for(Kniga k:books){
            if(k!=null) {
                System.out.println(k.getAuthor() + ","+k.getTitle());
            }
            else{
                break;
            }

        }
    }

    public void replaceBook(String authorOld, String titleOld, String authorNew, String titleNew){
        for(Kniga k:books){
            if(k!=null){
                if(k.getAuthor().equals(authorOld) &&
                k.getTitle().equals(titleOld) && k.isAvailable()){
                    k.setAuthor(authorNew);
                    k.setTitle(titleNew);
                }

            }
            else{break;}
        }
    }

    public void replaceBook(Kniga oldBook, Kniga newBook){
        /*for(Kniga k:books){
            if(k!=null){
                if(k.equals(oldBook) && k.isAvailable()){
                    //k=newBook;
                }
            }
        }*/

        for(int i=0; i<books.length;i++){
            if(books[i]!=null){
                if(books[i].equals(oldBook)){
                    books[i] = newBook;
                }
            }
            else{break;}
        }
    }
}

class testLibrary{
    public static void main(String[] args) {
        Library lib = new Library();
        Kniga k1 = new Kniga("Rowling", "Harry Potter", true);
        Kniga k2 = new Kniga("Tolkien", "LofR", true);
        lib.addBook(k1);
        lib.addBook(k2);
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Library Options" + "\n" + "1. List all available books" +
                    "\n" + "2. Borrow a book " +
                    "\n" + "3. Return a book " +
                    "\n" + "4. Replace a book " +
                    "\n" + "5. Exit");

            int choice = scan.nextInt();
            scan.nextLine();
            String name, title;
            switch (choice){
                case 1:
                    lib.showBooks();break;
                case 2:
                    System.out.println("Enter author name");
                    name = scan.nextLine();
                    System.out.println("Enter book title");
                    title = scan.nextLine();
                    lib.borrowBook(name, title);
                    break;
                case 3:
                    System.out.println("Enter author name");
                    name = scan.nextLine();
                    System.out.println("Enter book title");
                    title = scan.nextLine();
                    lib.returnBook(name, title);
                    break;
                case 4:
                    System.out.println("Enter which book do you want to replace");
                    System.out.println("Enter author name");
                    name = scan.nextLine();
                    System.out.println("Enter the title");
                    title = scan.nextLine();
                    System.out.println("Enter new book information");
                    System.out.println("Enter new author name");
                    String nameNew = scan.nextLine();
                    System.out.println("Enter the title");
                    String titleNew = scan.nextLine();
                    Kniga knigaS = new Kniga(name, title, true);
                    Kniga knigaN = new Kniga(nameNew, titleNew, true);
                    lib.replaceBook(knigaS, knigaN);
                    lib.showBooks();
                    break;
                case 5:
                    return;
            }
        }
    }
}
