public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords){
        this.keywords = new String[keywords.length];
        for (int i = 0; i < keywords.length; i++){
            String keyword = new String(keywords[i]);
            this.keywords[i] = keyword;
        }
    }
    public String[] getKeywords(){
        return keywords;
    }

    public Main.Label getLabel(){
        return Main.Label.SPAM;
    }
}
