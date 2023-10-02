public class Word {
    private String  word_target;
    private String word_explain;

    public Word(String w_tar, String w_exp){
        word_target = w_tar;
        word_explain = w_exp;
    }

    public String getWordTarget(){
        return word_target;
    }

    public String getWordExplain(){
        return word_explain;
    }
}
