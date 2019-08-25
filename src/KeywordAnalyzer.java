abstract public class KeywordAnalyzer
implements Main.TextAnalyzer {
    abstract protected String[] getKeywords();
    abstract protected Main.Label getLabel();

    @Override
    public Main.Label processText(String text) {
        String[] keywords = getKeywords();
        for (String keyword: keywords
        ) {
            if (text.contains(keyword)){
                return getLabel();
            }
        }
        return Main.Label.OK;
    }
}
