package Progran.group;

public class Student {
    private String name;
    private String initials;
    private int numGroup;
    private int[] marks;


    public Student(String name, String initials, int numGroup) {
        this.name = name;
        this.initials = initials;
        this.numGroup = numGroup;
        this.marks = new int[5];

    }
    public void print(){
        System.out.printf("%-16s %-8s", this.name,this.initials);
        System.out.printf("Группа: %-4d Оценки: ", this.numGroup);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(this.marks[i] + " ");
        }
        System.out.println();
    }
}

