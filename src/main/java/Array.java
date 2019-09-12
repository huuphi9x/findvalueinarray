import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name 's student: ");
        String nameStudent = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nameStudent)) {
                System.out.printf("Position of students in the list %s is %d", nameStudent, (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.printf("Not found %s in the list.",nameStudent);
        }
    }

}
