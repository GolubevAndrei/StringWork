public class Main {
    public static void main(String[] args) {

//        1 Задание

        String fistName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = fistName + " " + middleName + " " + lastName;

        System.out.println("fullName = " + fullName);

//        2 Задание

        System.out.println(fullName.toUpperCase());

//        3 Задание

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");

        System.out.println(fullName);

//        4 Задание

        fullName = "Ivanov Ivan Ivanovich";
        int indexFist = fullName.indexOf(" ");
        fistName = fullName.substring(0,indexFist);
        int indexMiddle = fullName.indexOf(" ", indexFist + 1);
        middleName = fullName.substring(indexFist + 1, indexMiddle);
        lastName = fullName.substring(indexMiddle + 1);
        System.out.println(fistName);
        System.out.println(middleName);
        System.out.println(lastName);

    }
}