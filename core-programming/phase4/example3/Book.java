public class Book {
    private String title;
    private String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String toString(){
        return String.format("%s book by %s", this.title, this.author);
    }
}


// public class e_book{

// }

