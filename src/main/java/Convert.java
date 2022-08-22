import java.util.Map;

public class Convert implements Convector{
    private String clipboardText;

    public void convector(){
        clipboardText = ClipboardController.getSelectedText();

        for (Map.Entry<String, String> symbol : Helper.alphabet.entrySet()) {
            clipboardText = clipboardText.replace(symbol.getKey(), symbol.getValue());
        }
        ClipboardController.putTextToClipboard(clipboardText);
    }



}