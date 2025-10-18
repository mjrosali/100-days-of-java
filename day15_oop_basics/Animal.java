public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    public void makeSound(String sound) {
        for (int i = 0; i < 3; i++) {
            System.out.println(sound + " ");
        }
    }

    public void describe() {
        System.out.printf("I am a %s and I am %d years old!%n", getName(), getAge());
    }
}
