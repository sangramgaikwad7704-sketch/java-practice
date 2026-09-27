public class Student{
    private String name;
    private int age;
    private  int marks;
    private String course;
    private double salary;



    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;

    }
    public int getMarks(){
        return marks;
    }

    public void  setMarks(int  marks){
        if(marks>=0 && marks<=100){
        
        
        this.marks=marks;
        if(marks>=40){
            System.out.println("PASS");

        }
        else{
            System.out.println("FAIL");
        }
        }
        else{
            System.out.println("Please Enter valid marks");
        }
    }
    public void setAge(int age){
        if(age>=18 && age <=60){
        this.age=age;
            if(age<18){
                System.out.println("Not eligible");
            } else if(age>60){
                System.out.println("Age limit exceed");
            }
            }

            }
        }
        else{
            System.out.println("Invalid age");
        }
    
    
    public String getCourse(){
        return course;
    }
   public void setCourse(String course) {
    if (course.equals("MCA") || course.equals("BCA") || course.equals("BSc CS")) {
        this.course = course;
    }
    else {
        System.out.println("Invalid course");
    }
}

public double getSalary(){
    return salary;
}
public void setSalary(double salary){
    if(salary>=10000){
    this.salary=salary;
} else{
    System.out.println("Invalid salary");
}
}

    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Sangram");
        s1.setAge(-6);
        s1.setMarks(34);
        s1.setCourse("Bcs");
        
        System.out.println("The Name is :" +s1.getName());

        System.out.println(s1.getAge());
        System.out.println(s1.getMarks());
        System.out.println(s1.getCourse());
        s1.setSalary(56854.97);
        System.out.println("The Salary is :" + s1.getSalary());
    }

}
