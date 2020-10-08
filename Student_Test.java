package JavaCode;

public class Student_Test {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name="haha";
        student1.age=99;
        student1.snum="3181918136";
        student1.course.add("JAVA");
        student1.course.add("Python");
        student1.getInfo();
        System.out.println();
        student1.xuanKe("C++");
        student1.getInfo();
        System.out.println();
        student1.tuiKe("JAVA");
        student1.getInfo();
    }
}
