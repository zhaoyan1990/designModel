package factory;

/**
 * @Description: java类作用描述
 * @Author: zhaoyan
 * @Date: 2019/7/3$ 15:47$
 * @Version: 1.0
 */
public class AppleFactory implements Factory {
    @Override
    public Fruit1 getFruit() {
        return new Apple1();
    }
}
