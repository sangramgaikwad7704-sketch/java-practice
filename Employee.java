class Employee{
    int salary;
    void packqge(){
        System.out.println("RAM");
    }


}
class Employee1 extends Employee{
    void bark(){
        System.out.println("RAM1");
    }
}
class Main{
    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        e1.bark();
        e1.packqge();
    }
}