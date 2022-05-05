public class TesteImpressora {
    public static void main(String[] args) {
        Impressora Impr = new Impressora();
        System.out.println(Impr.exibir(1));
        System.out.println(Impr.exibir(2.5f, 3.6f));
        System.out.println(Impr.exibir(12.33f, "15"));
        System.out.println(Impr.exibir("11", 3.3f));
        System.out.println(Impr.exibir("a", "b", "c"));
        System.out.println(Impr.exibir(100, 1000, "500"));
    }
    
    
}
