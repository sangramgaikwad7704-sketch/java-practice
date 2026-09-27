abstract class Demo{
    String name;
    Demo(String name){
        this.name=name;
    }

    
      abstract void catSound();

      void catEating(){
        System.out.println("Cat is Eating");

        
      }
}
class Dog extends Demo{

    void catSound(){
            System.out.println("Cat is Sound");
        }
    public static void main(String[] args) {
        
        Dog d1=new Dog();
        System.out.println();
        d1.catEating();
        d1.catSound();
    }

}