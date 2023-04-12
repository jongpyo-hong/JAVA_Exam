package exam01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex01 {
    public static void main(String[] args) {
       // Book book = new Book();
       // System.out.println(book); // book.toString()

        Class cls1 = Book.class;
       // Class cls2 = book.getClass();

        Field[] fields = cls1.getFields();
        Method[] methods = cls1.getMethods();

        for (Field field : fields) {
            System.out.println(field);
        }

        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
