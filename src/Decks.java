import java.io.*;
import java.lang.management.BufferPoolMXBean;
import java.util.Scanner;
import java.io.RandomAccessFile;

public class Decks {
    Scanner sc = new Scanner(System.in);
    public static String newDeck1;
    public static String newDeck;
    Menu m = new Menu();

    public void fileName () throws Exception{
        System.out.print("Введите название файла :    ");
        newDeck = sc.next();
        newDeck1 = (newDeck + ".java");
        newColoda(newDeck1);
        m.menuDict();
    }

    public void newColoda(String filename) throws Exception{
        File file = new File("src//"+filename);
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        FileReader fileReader = new FileReader(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("import java.util.HashMap;\n");
        bufferedWriter.write("import java.util.Map;\n");
        bufferedWriter.write("public class " + newDeck + "{\n");
        bufferedWriter.write("  public void " + newDeck + "(){\n");
        bufferedWriter.write("  Map<String, String> map = new HashMap<String, String>();\n");
        bufferedWriter.write("      \n");
        bufferedWriter.write("  }\n");
        bufferedWriter.write("}\n");
        bufferedWriter.flush();
        bufferedWriter.close();

        //BufferedReader bufferedReader = new BufferedReader(fileReader);
        //while(bufferedReader.ready()){
            //System.out.println(bufferedReader.readLine());
        //}
    }


    public void addWord() throws Exception{
        System.out.println("Введите имя колоды:   ");
        String filename = sc.next();
        System.out.println("Введите слово на английском");
        Scanner addeng = new Scanner(System.in);
        String addengword = addeng.next();
        System.out.println("Введите слово на русском");
        Scanner addrus = new Scanner(System.in);
        String addrusword = addrus.next();


        File file1 = new File("src//" + filename + ".java");
        RandomAccessFile file = new RandomAccessFile(filename +".java", "rw");
        file = new RandomAccessFile("src//" + filename +".java","rw");

        long a = file1.length();
        long filepointer = a - 6;
        file.seek(filepointer);
        String adddick = "      map.put("+ addengword +"," + addrusword + ");\n    }\n}";
        file.writeChars(adddick);
        file.close();
        m.menuDict();
    }
}
