public class Main 
{
    public static void main(String[] args) 
    {
        Student student=new Student("Arjun", "S001", "B+");
        StudentView view=new StudentView();
        StudentController controller=new StudentController(student, view);
        System.out.println("Initial Details");
        controller.displayStudentDetails();
        controller.updateStudentName("Arjun Kumar");
        controller.updateStudentGrade("A");
        System.out.println("\n Updated Details");
        controller.displayStudentDetails();
    }
}