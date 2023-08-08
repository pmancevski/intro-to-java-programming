package Exercise20_01;

import java.io.*;

public class Utils {

    public static void write(File file, String string){
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(file))){
            outputStream.writeUTF(string);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String read(File file){
        StringBuilder stringBuilder = new StringBuilder();

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(file))) {
            while (true){
                stringBuilder.append(inputStream.readUTF());
            }
        }
        catch (EOFException exception){
            System.out.println("EOF exception");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        return stringBuilder.toString();
    }
}
