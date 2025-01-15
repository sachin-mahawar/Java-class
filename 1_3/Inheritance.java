class Person{
    String name,gender;
    int age;

    Person(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
}

class Teacher extends Person{
    String schoolName;

    Teacher(String name,String gender,int age, String schoolName){
        super(name, gender, age);
        this.schoolName=schoolName;
    }
}

public class Inheritance{
    public static void main(String[] args){
        Teacher t = new Teacher("Ray", "Male", 25, "Dales");
        System.out.println(t.getName());


    }


}