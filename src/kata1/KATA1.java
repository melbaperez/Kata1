package kata1;

import java.util.Date;

public class KATA1 {

    public static void main(String[] args) {
        Person person = new Person("Blas", new Date(71,9,29));
        System.out.println(person.getName()+ " tiene " + person.getAge());
    }
    
}