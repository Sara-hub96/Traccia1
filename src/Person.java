public class Person {

    private String firstName;
    private String surname;
    private int age;

    public Person(String firstName, String surname, int age){
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public static void printFirstThreeLetters(String[] objects){
        for (String obj : objects) {
            System.out.println(String.format("Le prime 3 lettere sono: %s", obj.substring(0,2)));
        }

    }}

