import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> fn = new HashMap<String,String> ();
        fn.put("dd", "dd");
        fn.put("kjk", "kjskfk");
        fn.put("kks", "klafjal");
        fn.put("klasfal", "kfaslk");

        fn.remove("dd");
        System.out.println(fn);
    System.out.println(fn.get("kks"));
    }
}
