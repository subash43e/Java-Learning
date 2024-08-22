abstract class Bike {
    public abstract void r15();

    public void Rtr4v200() {
        System.out.println("One of the tvs company");
    }
}

class FoveriteBikes extends Bike {
    public void r15() {
        System.out.println("one of the yamaha bike");
    }
}

public class Main {

    public static void main(String[] args) {
        FoveriteBikes myBikes = new FoveriteBikes();
        myBikes.Rtr4v200();
    }

}