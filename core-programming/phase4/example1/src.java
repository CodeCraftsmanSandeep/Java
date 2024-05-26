import java.time.LocalDate;
public class src {
    public static void main(String args[]){
        User youngerUser = new User();

        youngerUser.name = "james junior";
        youngerUser.birthDate = LocalDate.parse("2010-10-11");

        System.out.printf("%s was born on %s, and he is %d years old\n", youngerUser.name, youngerUser.birthDate, youngerUser.age());
        User elderUser = new User("ram senior", LocalDate.parse("1986-10-21"));
        System.out.printf("%s was born on %s, and he is %d years old\n", elderUser.name, elderUser.birthDate, elderUser.age());
    }
}