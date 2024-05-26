import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;
public class Src{
    public static void main(String args[]){
        User user1 = new User("riyaz", LocalDate.parse("2012-10-30"));
        Book book1 = new Book("Bhagavatham", "krishna");
        user1.borrow(book1);
        Book book2 = new Book("Mahabharatam", "krishna");
        user1.borrow(book2);

        // list all books borrowed by user1
        AtomicInteger count = new AtomicInteger(1);
        user1.books.forEach(book -> {
            System.out.printf("%d) %s\n", count.getAndIncrement(), book.title);
        });
        System.out.println();

        // another way to print
        System.out.printf("Books borrowed by %s are %s\n", user1.name, user1.books.toString());
    }
}
