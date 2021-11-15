/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author purej1485
 */
public class ExamGrades {

    public static String examgrade(int grade) {

        String mark = "";
        if (grade < 50) {
            mark = "F";
        }
        if (grade <= 59 && grade >= 50) {
            mark = "D";
        }
        if (grade <= 69 && grade > 59) {
            mark = "C";
        }
        if (grade <= 79 && grade > 69) {
            mark = "B";
        }
        if (grade > 79 && grade <= 100) {
            mark = "A";
        }
        return mark;
    }
    
    public static void main(String[] args) {
        System.out.println(examgrade(85));
    }

}
