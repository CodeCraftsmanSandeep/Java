// note that birthDate is not disclosed in anyway after creating a object
// It is good to not disclose birthDate, to be more safe from cyber attacks which are happening daily!! 

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class User {
    private String name;
    private LocalDate birthDate;
    private ArrayList <Book> books = new ArrayList <Book> ();

    User (String name, String birthDate){
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        Period lived_time = Period.between(this.birthDate, LocalDate.now());
        return lived_time.getYears();
    }

    public String getBooksList(){
        return this.books.toString();
    }

    public String toString(){
        return String.format("user %s whose age is %d", this.name, this.getAge());
    }
    
}
