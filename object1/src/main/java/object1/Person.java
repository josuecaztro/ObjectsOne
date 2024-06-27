// Define a class
public class Person {
    // Define Instance Variables
    // different for each object!
    private String name;
    private int age = 0;
    private int height = 0;

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }


        public int getHeight(){
            return height;
        }
        public void setHeight(int height){
            this.height = height;
        }
    }


