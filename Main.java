import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gigi");
        person.getName();
        System.out.println("Buffon");
        person.getSurname();
        System.out.println(1.70);
        person.getHeight();
        System.out.println(43);
        person.getAge();

        String personDetails = String.format("%s\n%s : %s\n%s : %s\n%s : %.2f\n%s : %d", "Person Details:", "Name", person.getName(), "Surname", person.getSurname(), "Height", person.getHeight(), "Age", person.getAge());
        System.out.println(personDetails);
    }

}






