import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L; 
    private int studentID;
    private String name;
    private String grade;

    public Student(int studentID, String name, String grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }
    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class StudentSerializationDemo {
    public static void main(String[] args) {
        Student student = new Student(11441, "Madhur", "A+");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Student object serialized successfully!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Student object deserialized successfully!\n");
            deserializedStudent.displayStudent();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
