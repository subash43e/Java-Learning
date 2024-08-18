public class hello {
    public static void main(String [] args) {
        String[][] name = { {"Dogs", "Cats", "Birds"}, {"rabbit", "cow", "lion"} }; 

        for (String[] innerArray : name) {  
            for (String species : innerArray) { 
                System.out.println(species.length());
            }
        }
    }
}