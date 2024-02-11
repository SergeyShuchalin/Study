package Progran;

public class Program {
    public static void main(String[] args) {
//        Progran.Person p1 = new Progran.Person(); // создали объект(экземпляр класса)
//        p1.displayInfo();

//        p1.name = "Виктор";
//        p1.age = 28;
//        p1.displayInfo();

//        Progran.Person p2 = new Progran.Person("Игорь");
//        p2.displayInfo();
//
        Person p3 = new Person("Валентин", 25);
        p3.name = "Николай";
        p3.getAge();
        p3.setAge(36);
        p3.displayInfo();

//        Progran.Person p4 = new Progran.Person(30);
//        p4.displayInfo();
    }
}

class Person {
    public String name;
    private int age;

    public int getAge() { //геттер для получения доступа к значению переменной
        return age;
    }

    public void setAge(int age) { // Для внесение нового значния переменной private
        if (age > 0 && age < 110)
            this.age = age;
    }

    // Инициализатор значений(выполняется до конструкторов), инициализирует первоначальные значения
//    {
//        name = "Первоначальное значение";
//        age = 100;
//    }

    // Конструкторы
    public Person() {
        name = "Неизвестно";
        age = 18;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
        setAge(age);
        this.name=name;
    }

    public Person(int a) {
        age = a;
    }

    // Метод
    void displayInfo() {
        System.out.printf("Name: %s\nAge: %d%n", name, age);
    }
}
