package Main;

public class Student
{
    private final String name;
    private int noExercs;
    Student(String name, int noExercs)
    {
        assert noExercs >= 0;
        this.name = name;
        this.noExercs = noExercs;
    }
    Student(String name)
    {
        this(name, 0);
    }
    Student(Student in) //Copy constructor
    {
        this(in.getName(), in.getNoExercs());
    }
    public String getName()
    {
        return name;
    }
    public int getNoExercs()
    {
        return noExercs;
    }
    public void incNoExercs(int inc)
    {
        if(inc > 0)
        {
            noExercs += inc;
        }
    }
    public String toString()
    {
        return "Name: " + name + ". Number of excercises: " + Integer.toString(noExercs);
    }
}