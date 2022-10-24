import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest
{
    Cohort cohortGreen;
    Cohort cohortBlue;
    Cohort cohortRed;

    @Before
    public void init()
    {
        cohortGreen = new Cohort();
        cohortBlue = new Cohort();
        cohortRed = new Cohort();

        Student julian = new Student(10L, "Julian");
        Student juan = new Student(20L, "Juan");

        julian.addGrade(100);
        julian.addGrade(80);

        juan.addGrade(100);
        juan.addGrade(90);

        //A Cohort instance can add a Student to the List of students.
        cohortBlue.addStudent(julian);

        cohortRed.addStudent(julian);
        cohortRed.addStudent(juan);

    }

    //A Cohort instance can get the current List of students.
    @Test
    public void testIfGetStudentListWors()
    {
        assertEquals(1, cohortBlue.getStudents().size());
        assertEquals(2, cohortRed.getStudents().size());
    }

    @Test
    public void testIfGetStudentId()
    {
        assertEquals(10, cohortRed.getStudents().get(0).getId());
        assertEquals(20, cohortRed.getStudents().get(1).getId());
    }

    //A Cohort instance can get the average, and it's being calculated correctly.
    @Test
    public void testIfCohortAvgWorks()
    {
        assertEquals(90, cohortBlue.getCohortAverage(), 0.5);
        assertEquals(92.5, cohortRed.getCohortAverage(), 0.5);
    }
}
