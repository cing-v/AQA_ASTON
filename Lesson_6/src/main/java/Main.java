import java.util.HashSet;
import java.util.Set;
// import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Создаём коллекцию содержащую объекты класса Student
        Set<Student> studentCollection = new HashSet<>();
    }
    // Метод, удаляющий студентов со средним баллом < 3
    void removeWeakStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            }
        }
    }
    // Метод, переводящий студентов со средним баллом >= 3 на следующий курс
    void upStudentsCourse(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
            }
            // Если студент закончил 5 курс - удаляем из множества
            if (student.getCourse() > 5) {
                iterator.remove();
            }
        }
    }
    // Метод печатающий имена студентов заданного курса
    void printStudent(Set<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
