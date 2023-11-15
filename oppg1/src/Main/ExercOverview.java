package Main;
import java.util.ArrayList;

public class ExercOverview
{
    private ArrayList<Student> students;
    ExercOverview(Student[] students)
    {
        this.students = new ArrayList<Student>();
        for(Student student : students)
        {
            this.students.add(new Student(student));
        }
    }
    ExercOverview(String[] names)
    {
        students = new ArrayList<Student>();
        for(String name : names)
        {
            students.add(new Student(name));
        }
    }
    ExercOverview()
    {
        this(new String[]{});
    }
    public int getNoStuds()
    {
        return students.size();
    }
    public int getNoExercsTurnedIn(int index)
    {
        return students.get(index).getNoExercs();
    }
    public int getNoExercsTurnedIn(String studName)
    {
        for(Student student : students)
        {
            if(student.getName().equals(studName))
            {
                return student.getNoExercs();
            }
        }
        return -1;
    }
    public void AddStudent(Student student)
    {
        students.add(student);
    }
    public void AddStudent(String studentName, int excercs)
    {
        students.add(new Student(studentName, excercs));
    }
    public void AddStudent(String studentName)
    {
        students.add(new Student(studentName));
    }
    public void IncExcersStud(int index, int inc)
    {
        students.get(index).incNoExercs(inc);
    }
    public void IncExcersStud(String studName, int inc)
    {
        for(Student student : students)
        {
            if(student.getName().equals(studName))
            {
                student.incNoExercs(inc);
                return;
            }
        }
    }
    public String toString()
    {
        String res = "List of students:";
        for(Student student : students)
        {
            res += "\n" + student.toString();
        }
        return res;
    }
}