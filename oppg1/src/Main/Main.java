package Main;

public class Main
{
    public static void main(String[] args)
    {
        Student s = new Student("Jonas");
        s.incNoExercs(3);
        System.out.println(s.getNoExercs());
        System.out.println(s.toString());

        ExercOverview over = new ExercOverview(new Student[]{new Student("Per"), new Student("Ole"), new Student("Jan")});
        over.AddStudent("James");
        System.out.println(over.getNoExercsTurnedIn(1));
        System.out.println(over.getNoExercsTurnedIn("Per"));
        over.IncExcersStud(0, 3);
        over.IncExcersStud("Ole", 1);
        System.out.println(over.toString());
    }
}