public class ResultadoEscolarTernaria {
    public static void main(String[] args) {

        // cenário 1
        /*
         * int nota = 6;
         * String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
         * System.out.println(resultado);
         */

        // cenário 2
        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}