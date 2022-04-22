package coding_exercise30;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Edis");
        person.setLastName("Mehmed");
        person.setAge(22);
        System.out.println("Full name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Teen: " + person.isTeen());
        System.out.println();

        person.setFirstName("Ryan");
        person.setLastName("Donald");
        person.setAge(17);
        System.out.println("Full name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Teen: " + person.isTeen());
    }
}
