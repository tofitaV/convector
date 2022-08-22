import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Listener implements NativeKeyListener {

    Convector convertor;

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent) {
        convertor = new Convert();
        if (nativeKeyEvent.getKeyCode() == NativeKeyEvent.VC_CONTROL_R) {
            try {
                convertor.convector();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent) {
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent) {
    }
}
