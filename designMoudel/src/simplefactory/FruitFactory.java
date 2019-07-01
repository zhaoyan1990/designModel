package simplefactory;


/**
 * (1)工厂角色：简单工厂模式的核心，他负责实现创建所有实力的内部逻辑，工厂类可以被外界直接调用，创建所需的产品对象；
 */

/**
 * @Description: 工厂类，抽象出来的一个类，能够表示一个属性的所有类
 * @Author: zhaoyan
 * @Date: 2019/7/1$ 14:12$
 * @Version: 1.0
 */
public class FruitFactory {
    //    public static Fruit getApple(){
//        return new Apple();
//    }
//    public static Fruit getBanana(){
//        return new Banana();
//    }
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//        if (type.equalsIgnoreCase("apple")) {
//        return Apple.class.newInstance();
//        }else if (type.equalsIgnoreCase("banana")){
//            return Banana.class.newInstance();
//        }else{
//            System.out.println("找不到相应地实例化类");
//            return null;
//        }

//动态加载，一般用第二种情况的比较多。动态加载需要知道产品类的具体名称；
        Class fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();

    }
}
