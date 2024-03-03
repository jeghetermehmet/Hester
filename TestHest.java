public class TestHest {
    public static void main(String[] args) {
        EngelskFullblodsHest willy = new EngelskFullblodsHest("William", 11);
        PasoFino rod = new PasoFino("Rodrigues", 5);
        IslandsHest vidja = new IslandsHest("Vidja", 12);

        willy.skritt();
        willy.trav();
        willy.galopp();

        rod.skritt();
        rod.toelt();

        vidja.trav();
        vidja.toelt();
        vidja.pass();
    }
    
}
