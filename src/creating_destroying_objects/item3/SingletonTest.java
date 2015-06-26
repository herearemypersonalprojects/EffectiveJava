package creating_destroying_objects.item3;

/**
 * Created by quocanh on 26/06/15.
 * <p/>
 * Contact: ing.dev.java@gmail.com
 */
public class SingletonTest {


    static public void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.setVar(11);

        SingletonClass singletonClass1 = SingletonClass.getInstance();
        System.out.println(singletonClass1.getVar());

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.setVar(13);

        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton1.getVar());

    }
}
