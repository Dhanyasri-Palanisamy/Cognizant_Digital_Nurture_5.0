public class Main {

    public static void main(String[] args) {

        Student student = new Student("Dna",101,"A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        controller.updateView();

        System.out.println();

        controller.setStudentName("Arun");

        controller.setStudentGrade("O");

        controller.updateView();

    }

}