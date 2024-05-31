public class MethodOverriding {
  
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat c=new Cat();
        animal.Sound();
        c.Sound();


    }
}
class Animal{
    public void Sound(){
        System.out.println("Animal is making a sound");
    }

}
class Cat extends Animal{
    public void Sound(){
        System.out.println("sound");
    } 
}

