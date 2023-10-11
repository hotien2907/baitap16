package baitap3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File text3 = new File("text.txt");
        text3.createNewFile();

        String content = readFile("text.txt");
        String[] words = content.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word :words
             ) {
            map.put(word ,map.containsKey(word ) ? map.get(word)+1   :1);
        }

        List<String> lists = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                lists.add(entry.getKey());
            }
        }

        System.out.println("Các từ trùng lặp trong file:");
        for (String word : lists) {
            System.out.println(word);
        }
    }

    public static String readFile( String st) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(st));

        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append(" ");
        }

        reader.close();
        return content.toString().trim();

    }
}
