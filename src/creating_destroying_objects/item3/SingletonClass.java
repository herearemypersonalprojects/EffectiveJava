package creating_destroying_objects.item3;

/**
 * Created by quocanh on 26/06/15.
 * <p/>
 * Contact: ing.dev.java@gmail.com
 */
// Singleton with static factory
public class SingletonClass {

    private static final SingletonClass INSTANCE = new SingletonClass();

    private int var = 10;

    private SingletonClass(){}; // this class can not be instantiated

    public static SingletonClass getInstance() {return INSTANCE;}

    public int getVar() { return var; }
    public void setVar(int value) {this.var = value;}
}
