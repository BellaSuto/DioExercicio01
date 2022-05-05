package br.com.dio.atividade1;

public class CalculadoraBasica {

        public static void soma (int a, int b){
                int resultado = (a + b);
                System.out.println("Resultado da soma entre "+a+" e " +b+" é: " + resultado);

        }
        public static void subtracao (int a, int b) {
                int resultado = (a - b);
                System.out.println("Resultado da subtração entre "+a+" e " +b+" é: " + resultado);

        }
        public static void multiplicacao (int a, int b) {
                int resultado = (a * b);
                System.out.println("Resultado da multiplicação entre "+a+" e " +b+" é: " + resultado);

        }
        
        public static void divisao (int a , int b) {
                double x;
                x = (double) a;
                double y;
                y = (double) b;
                double resultado = x / y;
                System.out.println("Resultado da divisão entre "+a+" e " +b+" é: "+ resultado);

        }

}
