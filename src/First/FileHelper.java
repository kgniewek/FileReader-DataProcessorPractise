package First;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FileHelper {
    private final String PATHNAME = "src/First/people.txt";
    public List<String> list = new LinkedList<>();
    public List<String> readListFromFile(){
        try{
            BufferedReader input = new BufferedReader(new FileReader(PATHNAME));
            String lines;
            while ((lines = input.readLine()) != null){
                list.add(lines);
            }
        }catch (IOException e){
            System.out.println(e);
        }
        return list;
    }
}
