package search_value_array;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String[] students = {"Christian",
                "Michael",
                "Camila",
                "Sienna",
                "Tanya",
                "Connor",
                "Zachariah",
                "Mallory",
                "Zoe",
                "Emily"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name’s student");
        String studentName=scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(studentName)) {
                System.out.println("Position of the students in the list " + studentName + " is: " + ++i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + studentName + " in the list.");
        }
    }
}
