public class Word {
    private String  word_target;
    private String word_explain;

    public Word(String w_t, String w_e){
        word_target = w_t;
        word_explain = w_e;
    }

    public String getWordTarget(){
        return word_target;
    }

    public String getWordExplain(){
        return word_explain;
    }
}
