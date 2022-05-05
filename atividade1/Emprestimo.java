package br.com.dio.atividade1;

public class Emprestimo {

    double taxaDuasParcelas;
    double taxaTresParcelas;
    double valorFinal;

    public static void Calcular(double valor, int parcelas, double taxaDuasParcelas, double taxaTresParcelas){
        if(parcelas == 2) {
            double valorFinal =  (valor * taxaDuasParcelas) +valor;
            System.out.println("Valor final para emprestimo com 2 parcelas é R$: " + valorFinal);
        }else if (parcelas == 3) {
            double valorFinal = (valor * taxaTresParcelas) + valor;
            System.out.println("Valor final para emprestimo com 3 parcelas é R$: " + valorFinal);
        }else{
            System.out.println("Quantidade de parcelas indisponíivel");


        }
    }

}
