public class Sample {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Найда");
        dog1.run();
        dog2.run();
    }
}

class Dog {
    private String name;
    private Foot foot;


    public Dog(String name) {
        this.name = name;
        foot = new Foot();
        System.out.println("Экземпляр класса foot");
    }

    void run() {
        foot.run();
    }

    class Foot {
        String name = "Foot";

        void run() {
            System.out.println("Собака " + Dog.this.name + " бежит...");
        }
    }
}