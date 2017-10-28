package edu.wzm.mybatis.domain;

import java.util.List;

/**
 * Created by gatsbynewton on 2017/8/16.
 */
public class Classes {

    private int id;
    private String name;

    private Teacher teacher;
    private List<Student> students;

    /**
     * 构造函数的参数需要与 Mapping 文件的返回结果相匹配才行，建议不使用构造函数
     * @return
     */
//    public Classes(String name, Teacher teacher, List<Student> students) {
//        this.name = name;
//        this.teacher = teacher;
//        this.students = students;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class [id=" + id + ", name=" + name + ", teacher=" + teacher +
                ", students=" + students + "]";
    }
}
