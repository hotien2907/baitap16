package baitap2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File text = new File("fileText.txt");
        text.createNewFile();
        FileWriter fileWriter = new FileWriter(text);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("chuc mung nam moi hi hi");
        bufferedWriter.newLine();
        bufferedWriter.write("chuc mung nam moi hi hi");
        bufferedWriter.close();
        int lineCount = countLines("fileText.txt");

        System.out.println("Số lượng dòng trong file: " + lineCount);
    }

    public static int countLines(String st) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(st));

        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }

        reader.close();
        return lineCount;
    }
}
