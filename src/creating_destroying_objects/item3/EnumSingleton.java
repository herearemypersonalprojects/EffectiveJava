package creating_destroying_objects.item3;

/**
 * Created by quocanh on 26/06/15.
 * <p/>
 * Contact: ing.dev.java@gmail.com
 */
public enum EnumSingleton {
    INSTANCE;

    private int var = 10;

    public int getVar() { return var; }
    public void setVar(int value) {this.var = value;}
}
