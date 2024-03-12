package Dev_03;

public class b {
    public static void main(String[] args) {
        int primeiroTermo = 2, padrao = 2, quantidade = 7;
        for (int i = 1; i <= quantidade; i++) {
            System.out.print(primeiroTermo + " ");
            primeiroTermo *= padrao;
        }

    }
}
