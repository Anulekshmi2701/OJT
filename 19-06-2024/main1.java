class Shape {
    void draw(){
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Square extends Shape {
 
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Triangle extends Shape {

    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
public class main1{
    public static void main(String[] args) {
       
        Circle circle=new Circle();
        Square square=new Square();
        Triangle triangle=new Triangle();
       
        circle.draw();
        square.draw();
        triangle.draw();
    }
}
       


        
//     }
// }

//  class Shape {
//     public void draw() {
//         System.out.println("Drawing a shape");
//     }
// }

//  class Circle extends Shape {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a circle");
//     }
// }

//  class Rectangle extends Shape {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a rectangle");
//     }
// }

// public class Main1 {
//     public static void main(String[] args) {
//         Shape[] shapes = new Shape[3];
//         shapes[0] = new Circle();
//         shapes[1] = new Rectangle();
//         shapes[2] = new Circle();

//         for (Shape shape : shapes) {
//             shape.draw();
//         }
//     }
// }