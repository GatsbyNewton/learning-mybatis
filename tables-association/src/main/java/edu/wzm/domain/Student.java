package edu.wzm.domain;

/**
 * Created by gatsbynewton on 2017/8/16.
 */
public class Student {

    private int id;
    private String name;
    private String sno;
    private float score;

//    private Classes classes;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student[")
                .append("id=" + id)
                .append(", name=" + name)
                .append(", sno=" + sno)
                .append(", score=" + score)
//                .append(", classes=" + classes)
                .append("]");

        return sb.toString();
    }
}
