import java.util.Arrays;

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

//        5 Задание

        fullName = "ivanov ivan ivanovich";
        char[] chFullName = fullName.toCharArray();
        chFullName[0] = Character.toUpperCase(chFullName[0]);
        for (int i = 0; i < chFullName.length; i++) {
            if (chFullName[i] == ' ') {
                chFullName[i + 1] = Character.toUpperCase(chFullName[i + 1]);
            }
        }
        System.out.println(chFullName);

//        6 Задание

        String fist = "135";
        String second = "246";
        String str = fist + second;
        StringBuilder sb = new StringBuilder(fist + second);
        String min = str.substring(0, 1);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (min.compareTo(str.substring(i, i + 1)) > 0) {
                min = str.substring(i, i + 1);
            }
        }
        for (int i = 0; i < sb.length() - 1; i++) {
            int position = str.substring(i, i + 1).compareTo(min);
            if (position >= 0){
                sb.setCharAt(position, str.substring(i, i + 1).charAt(0));
            }
        }
      System.out.println(sb);
    }
}