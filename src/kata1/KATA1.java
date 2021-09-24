package kata1;

import java.time.LocalDate;

public class KATA1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1971, 9, 29);
        Person person = new Person("Blas", date);
        System.out.println(person.getName()+ " tiene " + person.getAge() + " años");

    }
    
}