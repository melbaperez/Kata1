package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class KATA1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1971, 9, 29);
        Person person = new Person("Blas", date);
        System.out.println(person.getName()+ " tiene " + person.getAge() + " años");

    }
    
}