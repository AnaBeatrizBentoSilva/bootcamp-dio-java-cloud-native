public class App {
    public static void main(String[] args) {
        Person person = new Person("John");
        Person.setTest("Test 123");
        System.out.println(person.getName() + " is " + person.getAge() + " years old." + " Test: " + Person.getTest());
    }
}
