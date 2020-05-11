/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

/**
 *
 * @author Forge-15 1650
 */
public class Course <T> {
    protected String code;
    protected String name;
    protected int credit;
    protected char grade;

    public Course(String code, String name, int credit, char grade) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.grade = grade;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public char getGrade() {
        return grade;
    }
    
    @Override
    public String toString() {
        return "Course : " +  code + "(" + name + ") - " + credit + " credit hours. Grade : " + grade;
    }
    
}
