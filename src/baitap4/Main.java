package baitap4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader("src/output1.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(" ");
        }

        String[] arrStr = content.toString().split(" ");
        List<String> wordList = new ArrayList<>(Arrays.asList(arrStr));
        Collections.sort(wordList);

        for (String word : wordList) {
            System.out.println(word);
        }
    }
}
