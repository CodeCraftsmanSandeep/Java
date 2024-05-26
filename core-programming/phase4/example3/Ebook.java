public class Ebook extends Book {
    int pageCount;
    String fileFormat;
    Ebook(String title, String author, int pageCount, String fileFormat){
        super(title, author);
        this.pageCount = pageCount;
        this.fileFormat = fileFormat;
    }
}
