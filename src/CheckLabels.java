public class CheckLabels {

    public Main.Label checkLabels(Main.TextAnalyzer[] analyzers, String text){
        Main.Label label = Main.Label.OK;
        for (Main.TextAnalyzer analyzer: analyzers
             ) {
            label = analyzer.processText(text);
            if (label != Main.Label.OK)
                return label;
        }
        return label;
    }
}
