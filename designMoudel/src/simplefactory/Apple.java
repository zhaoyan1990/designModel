package simplefactory;
/**
 * 具体产品角色：简单工厂模式所创建的具体实例对象
 */
/**
 * @Description: 工厂类的具体实现类，苹果
 * @Author: zhaoyan
 * @Date: 2019/7/1$ 13:50$
 * @Version: 1.0
 */
public class Apple implements Fruit{
    public void get(){
        System.out.println("采集苹果");
    }
}
