import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by daniel on 3/8/17.
 */
public class Logger {


    public static void log(String filename,String s){
        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(new FileOutputStream(filename)));
            System.out.println(s);
        } catch (Exception error){
            System.err.print(error);
        }

        System.setOut(original);
    }
}
