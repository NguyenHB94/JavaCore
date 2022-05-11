package practice;

public class Student {

    private String id;
    private double avgPoint;
    private int age;
    private String classroom;

    public Student() {
    }

    public Student(String id, double avgPoint, int age, String classroom) {
        this.id = id;
        this.avgPoint = avgPoint;
        this.age = age;
        this.classroom = classroom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() > 8){
            System.out.println("Mã sinh viên không hợp lệ");
            return;
        }
        this.id = id;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        if (avgPoint > 10){
            System.out.println("Điểm trung bình không hợp lệ");
            return;
        }
        this.avgPoint = avgPoint;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18){
            System.out.println("Tuổi không hợp lệ");
        }
        this.age = age;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        if (classroom.charAt(0) == 'A' || classroom.charAt(0) == 'C') {
            this.classroom = classroom;
        } else{
            System.out.println("Tên lớp học không hợp lệ");
            return;
        }

    }

    public void checkStudentShip(){

        if (avgPoint >= 8.0){
            System.out.println("Đủ điều kiện được học bổng");
        } else {
            System.out.println("Không đủ điều kiện đạt học bổng");
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", avgPoint=" + avgPoint +
                ", age=" + age +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}
