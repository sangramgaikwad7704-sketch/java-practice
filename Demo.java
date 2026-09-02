class Demo{
    public static void main (String args[]){
    Student s1 = new Student();
    Student s2 = new Student();

    s1.age=20;
    s1.name="RAM";
    
    

    
    class Student{
    String name;
    int age;
    int id;
    String college;

    void markAttendence(){
        System.out.println("Attendence marked by:"+name);

    }

    // void print(){
    //     System.out.println(name+",", id+ ",", college+",",age+",");
    // }
    }
}
}