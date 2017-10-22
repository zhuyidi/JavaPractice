package ClassOne;

import java.util.Scanner;

/**
 * Created by dela on 10/22/17.
 */
public class Student {
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(){ }

    public Student(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student[name='" + this.name + "',sex='" + this.sex + "',age=" + this.age + "]";
    }

    public static void main(String[] args){
        String name;
        String sex;
        int age;
        Scanner scanner = new Scanner(System.in);

        name = scanner.next();
        age = scanner.nextInt();
        sex = scanner.next();

        Student student = new Student(name, sex, age);
        System.out.print(student.toString());
    }
}
