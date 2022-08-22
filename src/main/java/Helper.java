import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Helper {
    static Robot robot;
    static final Map<String, String> alphabet = new HashMap<String, String>(){{
            put("q", "й");
            put("w", "ц");
            put("e", "у");
            put("r", "к");
            put("t", "е");
            put("y", "н");
            put("u", "г");
            put("i", "ш");
            put("o", "щ");
            put("p", "з");
            put("[", "х");
            put("]", "ъ");
            put("a", "ф");
            put("s", "ы");
            put("d", "в");
            put("f", "а");
            put("g", "п");
            put("h", "р");
            put("j", "о");
            put("k", "л");
            put("l", "д");
            put(";", "ж");
            put("'", "э");
            put("z", "я");
            put("x", "ч");
            put("c", "с");
            put("v", "м");
            put("b", "и");
            put("n", "т");
            put("m", "ь");
            put(",", "б");
            put(".", "ю");
            put("/", ".");
            put("&", "?");
    }};

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public static void controlC() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public static void controlV() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

}
