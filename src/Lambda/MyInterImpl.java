package Lambda;

import java.util.concurrent.Callable;

public class MyInterImpl {

    MyInter m = new MyInter() {
        @Override
        public void sayHello() {
            System.out.println("First anonymous class");
        }
    };
    Callable

}
