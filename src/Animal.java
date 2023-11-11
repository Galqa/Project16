/*
Необхідно здійснити десеріалізацію з файлу попереднього проекту (Animal) та вивести на екран вміст.
 */


import java.io.*;

class Animal implements Serializable {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class NewAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 10);
        // Серіалізація
        try {
            FileOutputStream fos = new FileOutputStream("animal.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(animal); // out, записуємо об'єкт в файл
            oos.close(); // закриваємо ObjectOutputStream
            fos.close(); // закриваємо файл
            System.out.println("Серіалізований об'єкт Animal збережено в animal.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Десеріалізація
        try {
            FileInputStream ois = new FileInputStream("animal.ser");
            ObjectInputStream oos = new ObjectInputStream(ois);
            Animal deserializedAnimal = (Animal) oos.readObject(); // зчитуємо об'єкт з файлу
            oos.close(); // in
            ois.close(); // fileIn
            System.out.println("Десереалізований об'єкт Animal: "  + deserializedAnimal);
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Клас Animal не знайдено");
            c.printStackTrace();
            return;
        }
    }
}
