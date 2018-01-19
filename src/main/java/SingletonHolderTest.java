/**
 * @author chentao
 * @date 2017/11/19
 **/
public class SingletonHolderTest {
    static class SingletonHolder {
        static SingletonHolderTest instance = new SingletonHolderTest();
    }

    public static SingletonHolderTest getInstance() {
        return SingletonHolder.instance;
    }
}
