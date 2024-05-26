import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
public class User {
    public String name;
    public LocalDate birthDate;
    public ArrayList <Book> books = new ArrayList <Book> ();

    // constructor
    public User(){

    }

    // constructor
    public User(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    // method to find age
    public int age(){
        Period lived_time = Period.between(this.birthDate, LocalDate.now());
        return lived_time.getYears();
    }

    public void borrow(Book book){
        this.books.add(book);
    }

}