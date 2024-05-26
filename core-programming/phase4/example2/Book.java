
public class Book {
    public String title;
    public String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    // toString() method to get a string when printed
    public String toString(){
        return String.format("%s by author %s", this.title, this.author);
    }
}
