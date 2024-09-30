public class q2 {

    /*
    2) Escreva um programa que verifique, em uma string, a existência da letra
     ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes
      em que ela ocorre.
     */
    public static void main(String[] args) {
        verificaString("salada");
    }
    static void verificaString(String string){
        System.out.println(string.contains("a")?"Nessa String tem a letra A":"Nessa String não tem a letra A" );
        int total = 0;
        for(int i=0;i<string.toLowerCase().length();i++){
            if(string.toLowerCase().charAt(i)=='a'){
                total++;
            }
        }
        System.out.println("O total de vezes que a letra a aparece é "+total);
    }
}
