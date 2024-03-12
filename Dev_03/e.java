package Dev_03;

public class e {
    public static void main(String[] args) {
        int quantidaade = 7;
        int primeiro = 1, segundo = 1, proximo;
        for (int i = 1; i <= quantidaade; i++) {
            System.out.print(primeiro + " ");
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

    }
}
