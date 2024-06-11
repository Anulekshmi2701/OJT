// import java.lang.annotation.ElementType;
// import java.lang.annotation.Retention;
// import java.lang.annotation.RetentionPolicy;
// import java.lang.annotation.Target;

// @Retention(RetentionPolicy.RUNTIME)
// @Target(ElementType.METHOD)
// @interface MyAnnotation{
//     String value();
// }
// public class CustomAnn {
//     @MyAnnotation("Custom Annotation")
//     public void annmethod(){
//         System.out.println("This is a annonated method");
//     }
//     public static void main(String[] args) {
//         CustomAnn obj=new CustomAnn();
//         obj.annmethod();
//         MyAnnotation ann=obj.getClass().getMethod("Method Annotated").geAnnotation(MyAnnotation.class);
//         System.out.println("Annotation value "+ ann.value);
//     }
// }
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

public class CustomAnn {

    @MyAnnotation("Custom Annotation")
    public void annMethod() {
        System.out.println("This is an annotated method");
    }

    public static void main(String[] args) throws Exception {
        CustomAnn obj = new CustomAnn();
        obj.annMethod();

        // Retrieve the method and its annotation
        Method method = obj.getClass().getMethod("annMethod");
        MyAnnotation ann = method.getAnnotation(MyAnnotation.class);

        // Directly print the annotation value
        System.out.println("Annotation value: " + ann.value());
    }
}
