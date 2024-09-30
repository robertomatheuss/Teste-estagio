public class q1 {
    /*
    1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o
    próximo valor sempre será a soma dos 2 valores anteriores (exemplo:
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem
    que desejar onde, informado um número, ele calcule a sequência de
    Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
     */
    public static void main(String[] args) {
        System.out.println(fibonacci(34));
    }
    static String fibonacci(int number){
        if (number < 0) {
            return "Não pertence";
        }
        int a = 0, b = 1, c = 0;
        while (c < number) {
            c = a + b;
            a = b;
            b = c;
        }
        return (c == number)?"Pertence": "Não pertence";
    }

}
