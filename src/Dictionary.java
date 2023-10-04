import java.util.ArrayList;

public class Dictionary {
    protected ArrayList<Word> dict;

    public Dictionary(){
// tmp
        dict = new ArrayList<Word>();
    }

    public ArrayList<Word> getDict(){
        return dict;
    }
}
