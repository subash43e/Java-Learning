import java.io.File;

public class Main {
    public static void main(String[] args) {
        File myfile = new File("filetext.txt");
        if (myfile.delete()) {
            System.out.println("Delete the file: " + myfile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}