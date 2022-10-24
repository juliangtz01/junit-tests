import java.util.ArrayList;

public class Student
{
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    //The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.
    public Student(long id, String name)
    {
        this.name = name;
        this.id = id;

        this.grades = new ArrayList<>();
    }

    //The Student class should have the following methods:

    // returns the student's name
    public String getName()
    {
        return name;
    }

    // returns the student's id
    public long getId()
    {
        return id;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade)
    {
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades()
    {
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage()
    {
        int sum = 0;

        for(int grade : grades)
        {
            sum += grade;
        }

        return (double)sum / grades.size();
    }
}
