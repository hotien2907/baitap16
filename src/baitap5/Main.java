package baitap5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader("src/output5.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(" ");
        }

        String[] arrStr = content.toString().split(" ");
        List<String> wordList = new ArrayList<>();
        String maxString = arrStr[0];


        for (int i = 1; i < arrStr.length; i++) {
            if (arrStr[i].length() > maxString.length()) {
                maxString = arrStr[i];
            }
        }


        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() == maxString.length()) {
                wordList.add(arrStr[i]);
            }
        }

        System.out.println("Từ dài nhất: " + maxString);
        System.out.println("Độ dài: " + maxString.length());
        System.out.println("Các từ có độ dài tương tự:");

        for (String word : wordList) {
            System.out.println(word);
        }
    }

}
