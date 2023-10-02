import java.util.ArrayList;

public class Dictionary {
    ArrayList<Word> dict;

    public Dictionary(){
        dict = new ArrayList<Word>();
    }

    public ArrayList<Word> getDict(){
        return dict;
    }
}
