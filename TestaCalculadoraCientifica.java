public class TestaCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        double resp1, resp2, resp3, resp4, resp5, resp6;
        resp1 = calc.raiz(9);
        resp2 = calc.raiz(9.9);
        resp3 = calc.raiz("99");
        resp4 = calc.potencia(52, 2);
        resp5 = calc.potencia("42", "2");
        resp6 = calc.potencia(10, 1.7);
        System.out.println(resp1);
        System.out.println(resp2);
        System.out.println(resp3);
        System.out.println(resp4);
        System.out.println(resp5);
        System.out.println(resp6);
    }
}
