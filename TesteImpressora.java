public class TesteImpressora {
    public static void main(String[] args) {
        Impressora Imp = new Impressora();
        Imp.exibir(1.25f);
        Imp.exibir(1.25f, 2.89f);
        Imp.exibir(1.25f, "Ola");
        Imp.exibir("Ola", 1.25f);
        Imp.exibir("Ola", "Hello ", "Hola");
        Imp.exibir(2, 13, "Ola");
    }
}
