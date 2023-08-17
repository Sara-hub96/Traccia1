public class Main {
    public static void main(String[] args) {
        Person[] peopleArray = new Person[]
                {
                        new Person("John", "Parker", 18),
                        new Person("Alice", "Cullen", 19),
                        new Person("Julian", "Smith", 16)
                };

        String[] surnameArray = new String[3];
        surnameArray[0] = peopleArray[0].getSurname();
        surnameArray[1] = peopleArray[1].getSurname();
        surnameArray[2] = peopleArray[2].getSurname();

        printFirstThreeLetters(surnameArray);
        System.out.println(thirdLettersChains(surnameArray, 2));

        for (Person person : peopleArray) {
            System.out.println(person.getAge());
        }
    }


    public static void printFirstThreeLetters(String[] objects) {
        for (String obj : objects) {
            System.out.println(String.format("Le prime 3 lettere sono: %s", obj.substring(0, 3)));
        }
    }

    public static String thirdLettersChains(String[] objects2, int n){
        String str = "";
        for (int i = 0; i < n; i++){
            String str2 = objects2[i];
            str += str2.charAt(2);
        }
        return str;
    }
}