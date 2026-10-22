import java.util.List;

class Student {
    private String name;
    private int course;
    private int group;
    private List<Integer> grades;
    // Конструктор
    public Student(String name, int course, int group, List<Integer> grades) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.grades = grades;
    }
    // Геттеры
    public String getName() {
        return this.name;
    }
    public int getCourse() {
        return this.course;
    }
    public int getGroup(){
        return this.group;
    }
    public List<Integer> getGrades() {
        return this.grades;
    }
    // Сеттер для изменения курса
    public void setCourse(int course) {
        this.course = course;
    }
    // Метод возвращающий средний балл студента
    public double getAverageGrade() {
        // Проверяем что множество существует и не пустое
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }
        // Вычисляем средний балл
        int sum = 0;
        for (int o : grades) {
            sum += o;
        }
        return (double)sum / grades.size();
    }
}
