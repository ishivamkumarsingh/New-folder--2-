import java.io.*;

class Person implements Serializable {
    private static final int serialVersionUID = 1; 
    private String name;
    private int age;
    private transient int password;
    
    public Person(String name, int age,int password) {
        this.name = name;
        this.age = age;
        this.password=password;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getpassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password=" + password +
                '}';
    }
}

public class SerializationExample {
    public static void main(String[] args) {
       
        Person person = new Person("John Doe", 30,123456789);

       
        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person); 
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Person deserializedPerson = null;
        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            deserializedPerson = (Person) in.readObject(); // Deserialize the object
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}