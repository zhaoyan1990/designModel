package factory;


/**
 * (1)工厂角色：简单工厂模式的核心，他负责实现创建所有实力的内部逻辑，工厂类可以被外界直接调用，创建所需的产品对象；
 */

/**
 * @Description: 工厂类，抽象出来的一个类，能够表示一个属性的所有类
 * @Author: zhaoyan
 * @Date: 2019/7/1$ 14:12$
 * @Version: 1.0
 */
public interface Factory {

    Fruit1 getFruit();

}
