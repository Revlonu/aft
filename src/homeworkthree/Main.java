package homeworkthree;

import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {

        String text = TextHandler.textFileReader("files/text.txt");

        Map <String, Integer> wordCount = TextHandler.wordCounter(text);

        System.out.println("Слова и их кол-во: " + wordCount);

        TextHandler.maxCountWorld(wordCount);
    }
}
