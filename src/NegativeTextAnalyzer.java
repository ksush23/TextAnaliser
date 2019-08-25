public class NegativeTextAnalyzer extends KeywordAnalyzer {

    public String[] getKeywords(){
        return new String[]{":(", "=(", ":|"};
    }
    public Main.Label getLabel(){
        return Main.Label.NEGATIVE_TEXT;
    }
}
