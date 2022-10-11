package 父类构造方法调用;

/**
 * created     by benjiamin at 2022-08-30 / 8:02 /02
 */
public class Child  extends  Father{
    public Child() {
        System.out.println("child无参构造方法");
    }
    public Child(String name) {
        System.out.println("child有参构造方法");
nam1();
    }
        public void nam1() {

            }
}

class Test{

    public static void main(String[] args) {
//        Child child=new Child("tom");
        Child child=new Child();
        //测试发现，无论子类的有参还是无参构造方法，开头都会调用一次父类的无参构造方法
    }
}
