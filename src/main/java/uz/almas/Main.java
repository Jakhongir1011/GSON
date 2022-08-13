package uz.almas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import uz.almas.model.Album;
import uz.almas.model.Staff;

import java.io.*;

public class Main {
    public static void main(String[] args) {

//        Gson gson = new Gson();
          GsonBuilder gsonBuilder= new GsonBuilder();
          Gson gson = gsonBuilder.setPrettyPrinting().create();
          


//        File file = new File("src/main/resources/album.json");
        // 2. for
        File file = new File("src/main/resources/staff.json");

        try( BufferedReader reader = new BufferedReader(new FileReader(file));) {
//            String line;
//            while ((line=reader.readLine())!=null){
//                System.out.println(line);
//            }


//            // Deserialize(fromJson) json -> object
//            Album album = gson.fromJson(reader,Album.class);
//            System.out.println(album);
//
//            // Serialize(toJson) object -> json
//            String toJson = gson.toJson(album);
//            System.out.println(toJson);

            //2. Deserialize(fromJson)
            Staff staff = gson.fromJson(reader,Staff.class);


            //2. Serialize(toJson)
            String toJson2 = gson.toJson(staff);
            System.out.println(toJson2);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
