public class StudentTest
{
    public static void main(String[] args)
    {
        Student julian = new Student("Julian", 01);

        julian.addGrade(80);
        julian.addGrade(90);
        julian.addGrade(80);
        julian.addGrade(70);

        System.out.printf("Student %s has a grade average of %.0f.", julian.getName(), julian.getGradeAverage());
    }
}
