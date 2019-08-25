public class TooLongTextAnalyzer
implements Main.TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }

    @Override
    public Main.Label processText(String text) {
        if (text.length() > maxLength){
            return Main.Label.TOO_LONG;
        }
        return Main.Label.OK;
    }
}
