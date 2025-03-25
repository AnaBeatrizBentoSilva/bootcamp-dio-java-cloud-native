import java.time.OffsetDateTime;

public class Person {
    private final String name;
    private int age;

    public String getName(){
        return name;
    }

    public Person(String name){
        this.name = name;
        this.age = 1;
    }

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public int getAge(){
        return age;
    }

    public void incAge(){
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;
            this.age++;
            this.lastYearAgeInc = OffsetDateTime.now().getYear();
        
    }

    private static String test;

    public static void setTest(String testParam){
        Person.test = testParam;
    }

    public static String getTest(){
        return test;
    }
}
