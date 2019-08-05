package at.tugraz.ist.cc.io;

/**
 * Created by glouwa on 16.04.16.
 */
public class OurLogger {
    private static OurLogger ourInstance = new OurLogger();

    public static OurLogger getInstance() {
        return ourInstance;
    }

    private OurLogger() {
    }

    public void print(String s)
    {
        //System.out.print(s);
    }
}
