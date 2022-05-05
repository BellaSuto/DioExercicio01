package br.com.dio.atividade1;

public class Main {

    public static void main(String[] args) {
        //Execução da classe Calculadora Basica
        CalculadoraBasica.soma(1,2);
        CalculadoraBasica.subtracao(8,3);
        CalculadoraBasica.multiplicacao(3,17);
        CalculadoraBasica.divisao(50,4);
        //Execução da classe mensagem
        Mensagem.receberMensagens(7);
        Mensagem.receberMensagens(17);
        Mensagem.receberMensagens(3);
        //Execução da classe Emprestimo
        Emprestimo.Calcular(1200, 2, 0.25,0.45 );
        Emprestimo.Calcular(1200, 3, 0.25,0.45 );
        Emprestimo.Calcular(1200, 4, 0.25,0.45 );

    }
}
