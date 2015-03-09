package lab3;

/**
 *
 * @author dnoonan1
 */
public class IllegalNameException extends Exception {

    /**
     * Creates a new instance of <code>IllegalNameException</code> without
     * detail message.
     */
    public IllegalNameException() {
    }

    /**
     * Constructs an instance of <code>IllegalNameException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalNameException(String msg) {
        super(msg);
    }
}
