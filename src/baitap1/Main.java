package baitap1;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File text = new File("text.txt");
        text.createNewFile();
        FileWriter fileWriter = new FileWriter(text);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("chuc mung nam moi hi hi");
        bufferedWriter.newLine();
        bufferedWriter.write("chuc mung nam moi hi hi");
        bufferedWriter.close();

        String content = readFile("fileText.txt");
        String[] words = content.split(" ");
        int count = words.length;

        System.out.println("Số lượng từ trong file: " + count);
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
