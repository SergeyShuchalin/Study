package Progran.group;

import java.util.Random;

public class Student {
    private String name;
    private String initials;
    private int numGroup;
    private int[] marks;
    private int nMark; // Номер оценки

    public boolean addGrade(int grade) {
        if (this.nMark >= this.marks.length) {
            return false;
        }
        this.marks[this.nMark] = grade;
        this.nMark++;
        return true;

    }

    public Student(String name, String initials, int numGroup) {
        this.name = name;
        this.initials = initials;
        this.numGroup = numGroup;
        this.marks = new int[5];
        this.nMark = 0;
    }

    public void print() {
        System.out.printf("%-16s %-8s", this.name, this.initials);
        System.out.printf("Группа: %-4d Оценки: ", this.numGroup);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(this.marks[i] + " ");
        }
        System.out.println();
    }

    public boolean isGood() {
        for (int i = 0; i < this.marks.length; i++) {
            if (this.marks[i] >= 1 && this.marks[i] <= 6) {
                return false;
            }

        }
        return true;

    }
}
