package Exercicio_03;

public class Main {
    public static void main(String[] args) {
        mostarDobro(8);
        mostrarSoma(10, 5);
        mostarMaior(4, 5);
    }

    public static void mostarDobro(int numero){
        System.out.println("O Dobro é: " + numero * 2);
    }

    public static void mostrarSoma(int a, int b){
        int soma = 0;
        soma = a + b;

        System.out.println("A Soma é: " + soma);
    }

    public static void mostarMaior(int a, int b){

        if (a > b){
            System.out.println("A é maior que B");
        } else{
            System.out.println("B é maior que A");
        }
    }
    // TODO: crie mostrarDobro(int numero), sem retorno.
    // TODO: crie mostrarSoma(int a, int b), sem retorno.
    // EXTRA: mostrarMaior(int a, int b).
}
