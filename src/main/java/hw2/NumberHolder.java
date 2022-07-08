package hw2;

/*
4.	Given the following class, called NumberHolder,
write some code that creates an instance of the class,
initializes its two member variables,
and then displays the value of each member variable.
public class NumberHolder {
    public int anInt;
    public float aFloat;
}
 */
public class NumberHolder {
    private int anInt;
    private float aFloat;

    public NumberHolder(int anInt, float aFloat) {
        this.anInt = anInt;
        this.aFloat = aFloat;
    }

    public NumberHolder() {
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }
}