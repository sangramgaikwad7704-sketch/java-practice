public class Student {
    String name;
    int age;
    void display(){
        System.out.println("Name is:" +name);
         System.out.println("age is :"+ age);

    }
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name=("sangram");
        s1.age=24;
        s1.display();
    }
}
