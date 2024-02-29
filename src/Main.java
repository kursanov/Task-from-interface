import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        EducationCenter school = new School("Toktogul","Kyrgyzstan",LocalDate.of(1980,4,13));
        EducationCenter university = new University("Slavianskiy","Kyrgyzstan",LocalDate.of(1980,4,30));
        EducationCenter college = new College("N57","Kyrgyzstan",LocalDate.of(2000,2,21));

        Student student1 = new Student("Zaripbek","Kursanov",Gender.MALE, LocalDate.of(2017,2,20),university);
        Student student2 = new Student("Arzybek","Kenjeev",Gender.MALE, LocalDate.of(2020,2,20),college);
        Student student3 = new Student("Gylam","Moolanov",Gender.MALE, LocalDate.of(2019,2,20),university);
        Student student4 = new Student("Nurlan","Abibbillaev",Gender.MALE, LocalDate.of(2010,2,20),school);
        Student student5 = new Student("Azim","Muratov",Gender.MALE, LocalDate.of(2015,2,20),college);
        Student student6 = new Student("Ydydrys","Ysakov",Gender.MALE, LocalDate.of(2017,2,20),school);
        Student student7 = new Student("Kurmanbek","Bakiev",Gender.MALE, LocalDate.of(2017,2,20),university);


        Student[] students = {student1,student2,student3,student4,student5,student6,student7};
        for (Student student : students) {
            //Aтын корсотуп  турат тушунуктуу болсун)
            student.methodGetName();
            // Метод getStudentsEducationCenter()
            student.getStudentsEducationCenter();
            // Метод getStudentsStudyingYear()
            student.getStudentsStudyingYear();
        }
        getInfo(students);
    }
    public static void getInfo(Student[] students){
        for (Student student : students) {
          System.out.println(student);
        }
    }
}