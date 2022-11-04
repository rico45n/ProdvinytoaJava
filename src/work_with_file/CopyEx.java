package work_with_file;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("test2.txt"));) {

//            int character;
//            while((character = reader.read()) !=-1){
//                writer.write(character);
//            }
            String line;
            while ((line = reader.readLine()) !=null){
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("done");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
