abstract class Hest{
    String navn;
    int alder;
    
    Hest(String n, int a){
        navn = n;
        alder = a;
    }
    void skritt(){
        System.out.println(navn + " gaar fremover.");
    }
    void trav() {
        System.out.println(navn + " 'jogger' med hoyre fremben og venstre bakben, deretter motsatt.");
    }
    void galopp() {
        System.out.println(navn + " beveger seg raskt med beina i tretakt.");
    }
}