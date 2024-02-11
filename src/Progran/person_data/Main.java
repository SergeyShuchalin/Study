package Progran.person_data;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Юля", "25.05.1986", "45-46-98", "Россия", "Москва", "Чистопрудный бульвар, 1А");
        h1.printInfo();
        h1.setName("Юлия");
        h1.setBirthday("26.05.1985");
        System.out.println(h1.getName());
        h1.printInfo();
        Human h2 = new Human("", "", "", "", "", "");
        h2.setName("Федор");
        h2.setBirthday("26.05.1986");
        h2.printInfo();
    }
}
