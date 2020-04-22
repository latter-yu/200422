
class Base {

    Base() {

        System.out.print("Base");

    }

}

public class T200402 extends Base {

    public static void main1( String[] args ) {

        new T200402();

        //调用父类无参的构造方法

        new Base();

    }

}

class X{

    Y y=new Y();

    public X(){
        System.out.print("X");
    }
}

class Y{

    public Y(){
        System.out.print("Y");
    }

}

public class T200402 extends X{

    Y y=new Y();

    public T200402(){
        System.out.print("Z");
    }

    public static void main2(String[] args) {
        new T200402();
    }

}


class B {

    public int Func() {
        System.out.print("B");
        return 0
    }

}

class D extends B {

    @Override
    public int Func() {
        System.out.print("D");
        return 0;
    }

}

public class T200402 {

    public static void main(String[] args) {
        B a = new B();
        B b = new D();

        a.Func();
        b.Func();
    }
    
}

