package factory;

/**
 * 单工厂模式(Simple Factory Pattern)：
 * 又称为静态工厂方法(Static Factory Method)模式，它属于类创建型模式。
 * 在简单工厂模式中，可以根据参数的不同返回不同类的实例。
 * 简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Factory appleFactory = new AppleFactory();
        appleFactory.getFruit().get();

    }
}
