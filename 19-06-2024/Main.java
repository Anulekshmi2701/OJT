class Animal{
    void sound(){
   System.out.println("animal make sound");   
    }    
}
class cat extends Animal{
    @Override
    void sound(){
        System.out.println("meow meow");
          }
        }
    class cow extends Animal{
        @Override
        void sound(){
            System.out.println("MOO MOO");
            }
    }
    public class Main {
    public static void main(String[] args) {
       Animal[] shapes = new Animal[3];
       shapes[0] = new Animal();
       shapes[1] = new cat();
       shapes[2] = new cow();
       for(Animal shape : shapes){
        shape.sound();
        }
        }
        }


