package uz.almas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import uz.almas.model.Album;

import java.io.*;

public class Main {
    public static void main(String[] args) {

//        Gson gson = new Gson();
          GsonBuilder gsonBuilder= new GsonBuilder();
          Gson gson = gsonBuilder.setPrettyPrinting().create();



        File file = new File("src/main/resources/album.json");

        try( BufferedReader reader = new BufferedReader(new FileReader(file));) {
//            String line;
//            while ((line=reader.readLine())!=null){
//                System.out.println(line);
//            }


            // Deserialize(fromJson)
            Album album = gson.fromJson(reader,Album.class);
            System.out.println(album);

            // Serialize(toJson)
            String toJson = gson.toJson(album);
            System.out.println(toJson);
           

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
