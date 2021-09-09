public class Impressora{
    public void exibir(float a){
        System.out.println(a);
    }

    public void exibir( float a, float b){
        System.out.printf("%.2f, %.2f\n", a, b);
    }

    public void exibir (float a, String b){
        System.out.printf("%.2f, %s\n", a, b);
    }

    public void exibir (String a, float b){
        System.out.printf("%s, %.2f\n", a, b);
    }

    public void exibir (String a, String b, String c){
        System.out.printf("%s, %s, %s\n", a, b, c);
    }

    public void exibir (int a, int b, String c){
        System.out.printf("%d, %d, %s\n", a, b, c);
    }
}