import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DictionaryManagement extends Dictionary{
    public void insertFromCommandLine(){
        Scanner sc = new Scanner(System.in);
        String wEnglish;
        String wVietnamese;

        wEnglish = sc.nextLine();
        wVietnamese= sc.nextLine();

        Word createdWord = new Word(wEnglish, wVietnamese);

        dict.add(createdWord);
    }

    public void showDictionary(){
        for(int i=0; i< dict.size(); i++){
            System.out.println(dict.get(i).getWordTarget() + " " + dict.get(i).getWordExplain());
        }
    }

    public boolean condition_sort(String a, String b){
        int tmp = a.compareTo(b);
        return (tmp == 1) ? true : false;
    }

    public void swap(Word w1, Word w2){
        Word tmp = w1;
        w1 = w2;
        w2 = tmp;
    }
    public void sortDict(){
        for( int i=0; i<dict.size(); i++){
            for(int j=i+1; j<dict.size(); j++){
                if(dict.get(i).getWordTarget().compareTo(dict.get(j).getWordTarget()) > 0){
                    Word tmp = dict.get(j);
                    dict.set(j, dict.get(i));
                    dict.set(i, tmp);
                }
            }
        }
    }
    public static void main(String[] args) {
        DictionaryManagement test = new DictionaryManagement();
        for(int i=1; i<=10; i++){
            test.insertFromCommandLine();
        }
        test.sortDict();
        test.showDictionary();
    }
}
