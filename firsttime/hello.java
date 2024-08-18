public class hello {
    public static void main(String [] args) {
        String[] name = { "Dogs", "Cats", "Birds" };

        for (String species : name) {
            System.out.println(species.length());
        }
    }
}
