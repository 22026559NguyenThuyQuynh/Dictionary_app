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
}
