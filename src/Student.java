import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Student implements Study {

    private String name;
    private String lastName;

    private Gender gender;

    private LocalDate dateOfStart;

    private EducationCenter educationCenter;

    public Student(String name, String lastName, Gender gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    @Override
    public void methodGetName() {
        System.out.println(getName());
    }

    @Override
    public void  getStudentsEducationCenter() {
        System.out.println(getEducationCenter());

    }



    @Override
    public void getStudentsStudyingYear() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfStart,currentDate);
        System.out.println("Окунганына "+period.getYears() + " жыл боолду \n");

    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfStart=" + dateOfStart +
                ", educationCenter=" + educationCenter +
                '}';
    }


}
