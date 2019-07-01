package simplefactory;

import simplefactory.Apple;
import simplefactory.Banana;

/**
 * 单工厂模式(Simple Factory Pattern)：
 * 又称为静态工厂方法(Static Factory Method)模式，它属于类创建型模式。
 * 在简单工厂模式中，可以根据参数的不同返回不同类的实例。
 * 简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
 */


public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//        Apple apple = new Apple();
//        Banana banana =new Banana();
//        apple.get();
//        banana.get();


//        //实例化一个apple --多态
//        Fruit apple = new Apple();
//        //实例化一个banana
//        Fruit banana = new Banana();
//        apple.get();
//        banana.get();

        //实例化apple
//        Fruit apple = FruitFactory.getApple();
//        apple.get();
//        Fruit banana = FruitFactory.getBanana();
//        banana.get();
//        Fruit apple = FruitFactory.getFruit("apple");
//        Fruit banana = FruitFactory.getFruit("banana");
//        apple.get();
//        banana.get();
        Fruit apple = FruitFactory.getFruit("simplefactory.Apple");
        Fruit banana = FruitFactory.getFruit("simplefactory.Banana");
        apple.get();
        banana.get();

    }
}
