// Define a class
class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    int height = 0;

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person joshua = new Person("joshua", 25, 160);
        System.out.print(joshua.height);

        /* Now you can use the Object  */

    }
}
