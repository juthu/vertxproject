/**
 * Created by sirena on 2015-12-12.
 */
public class main {
    public static void main(String [] args)
    {
        conn c = new conn();
        try {
            c.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
