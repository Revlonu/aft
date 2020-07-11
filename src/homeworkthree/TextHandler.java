package homeworkthree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TextHandler {
   public static int maxCountWorld;
   public static String textFileReader(String textAddress){
       File file = new File(textAddress);
        String text = "";
        try {
            FileReader textFile = new FileReader(file);

            Scanner textScan = new Scanner(textFile);
            while (textScan.hasNextLine()) {
                text = text + textScan.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text;
    }

    public static Map<String, Integer> wordCounter (String text){
        maxCountWorld = 0;
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ",");
        text = text.replaceAll("([^A-Za-zА-Яа-я])\\1", ",");
        System.out.println(text);
        Map<String, Integer> wordCount = new TreeMap<>();
        for (String word : text.split(","))
        {
            if (word != null){
                wordCount.put(word.toLowerCase(), wordCount.getOrDefault(word.toLowerCase(), 0) + 1);
                if(maxCountWorld < wordCount.get(word.toLowerCase())){
                    maxCountWorld = wordCount.get(word.toLowerCase());
                }

            }
        }
        return wordCount;
    }


    public static void maxCountWorld(Map<String, Integer> map) {
        Collection<String> collection= map.keySet();
        for (String key : collection) {
            Integer integerKey = map.get(key);
            if (key != null) {
                if (TextHandler.maxCountWorld == integerKey) {
                    System.out.println("Слово: " + key + ", кол-во раз в тексте: " + map.get(key));
                }
            }
        }
    }
}

