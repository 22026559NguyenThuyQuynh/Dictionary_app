import com.sun.org.apache.xpath.internal.objects.XString;

import java.io.*;
import java.nio.file.Files;

public class DictionaryCommandLine extends DictionaryManagement {

    private final static String FILE_URL = "C:/Users/Quynh/Downloads/AnhViet.txt";
    //private final static String FILE_URL_1 = "C:/Users/Quynh/Downloads/test_dictionary.txt";


    public DictionaryCommandLine() {
    }

    public void swap(Word w1, Word w2) {
        Word tmp = w1;
        w1 = w2;
        w2 = tmp;
    }

    public void sortDict() {
        for (int i = 0; i < dict.size(); i++) {
            for (int j = i + 1; j < dict.size(); j++) {
                if (dict.get(i).getWordTarget().compareTo(dict.get(j).getWordTarget()) > 0) {
                    Word tmp = dict.get(j);
                    dict.set(j, dict.get(i));
                    dict.set(i, tmp);
                }
            }
        }
    }

    public void showAllWord() {
        sortDict();
        for (int i = 0; i < dict.size(); i++) {
            String w_target = dict.get(i).getWordTarget();
            String w_explain = dict.get(i).getWordExplain();

            System.out.println(w_target + " " + w_explain);
        }
    }

    public void dictionaryBasic() {
        insertFromCommandLine();
        showAllWord();
    }

    public static void main(String[] args) throws IOException {
        DictionaryCommandLine test = new DictionaryCommandLine();

//        String[] data = {"test dictionary", "project"};
//
//        File file = new File(FILE_URL_1);
//
//        OutputStream outputStream = new FileOutputStream(file);
//        OutputStreamWriter outputStreamWriter= new OutputStreamWriter(outputStream);
//        for(String item : data){
//            outputStreamWriter.write(item);
//            outputStreamWriter.write("\n");
//        }
//        outputStreamWriter.flush();


        // doc file
        File file = new File(FILE_URL);
        InputStream inputStream = Files.newInputStream(file.toPath());
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String line = "@";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
//        }

//        test.dictionaryBasic();
//        test.dictionaryBasic();
        }

    }
}
