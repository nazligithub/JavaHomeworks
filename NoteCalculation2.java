public class NoteCalculation2 {


    public static void main(String[] args) {
        int[] grades = {84, 57, 29, 60};

        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            int nextMultiple = findNextMultipleOfFiveNew(grade);
            if (grade < 38) {
                System.out.println("Grade: " + grade + " failed.");
            } else if (nextMultiple - grade < 3) {
                grades[i] = nextMultiple;
                System.out.println("Student's uptaded grade: " + grades[i]);
            } else {
                System.out.println("Student's grade is: " + grade);
            }
        }
    }
    public static int findNextMultipleOfFiveNew(int grade) {
        return ((grade / 5) + 1) * 5;
    }
}








