package org.listaalgoritmos.template;
public class RespostaListaExercicio {

    public static void main(String[] args) {
        calcularImc();
        calcularAreaTrapezio();
        maiorEntreDoisInteiros();
        verificarParImpar();
        calcularMediaNotas();
        testarElementosImpares();
        testarElementosPares();
        testarMediaAritmetica();
    }


	        /*cálculo do imc */
    public static void calcularImc() {
        float peso = 70.0f;
        float altura = 1.75f;
        float imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
    }

	        /*cálculo do trapézio */

    public static void calcularAreaTrapezio() {
        float baseMaior = 10.0f;
        float baseMenor = 6.0f;
        float altura = 4.5f;
        float areaTrapezio = calcularAreaTrapezio(baseMaior, baseMenor, altura);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }

	        /* Cálculo de maior entre dois inteiros */ 
    public static void maiorEntreDoisInteiros() {
        int a = 10;
        int b = 7;
        int maior = maiorEntreDoisInteiros(a, b);
        System.out.println("Maior entre " + a + " e " + b + " é: " + maior);
    }
            /* Cálculo de número ímpar ou par */
    public static void verificarParImpar() {
        int numero = 15;
        boolean par = verificarParImpar(numero);
        System.out.println(numero + (par ? " é par" : " é ímpar"));
    }
           /* Cálculo de média das notas */
    public static void calcularMediaNotas() {
        float[] notas = { 7.5f, 8.0f, 9.3f, 6.5f, 8.7f };
        float media = calcularMediaNotas(notas);
        System.out.println("Média das notas: " + media);
    }
        /* Testando quais elemenentos são ímpar */
    public static void testarElementosImpares() {
        int[] array = { 2, 4, 6, 8, 10 };
        imprimirTesteParImpar(array, "ímpar");
    }
 
	    /* Testando quais elemenentos são par */
    public static void testarElementosPares() {
        int[] array = { 2, 4, 6, 8, 10 };
        imprimirTesteParImpar(array, "par");
    }
                 
	         /* Testando média aritmética */
    public static void testarMediaAritmetica() {
        int[] array = { 2, 4, 6, 8, 10 };
        float mediaAritmetica = calcularMediaAritmetica(array);
        System.out.println("Média aritmética dos elementos: " + mediaAritmetica);
    }




	                    // métodos auxiliares ...
    public static void imprimirTesteParImpar(int[] array, String tipo) {
        for (int num : array) {
            boolean condicao = tipo.equals("par") ? num % 2 == 0 : num % 2 != 0;
            System.out.println(num + " é " + tipo + "? " + condicao);
        }
    }

    public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) {
        if (baseMaior <= 0 || baseMenor <= 0 || altura <= 0) {
            throw new IllegalArgumentException("As bases e a altura devem ser maiores que zero.");
        }
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static int maiorEntreDoisInteiros(int a, int b) {
        return Math.max(a, b);
    }

    public static boolean verificarParImpar(int numero) {
        return numero % 2 == 0;
    }

    public static float calcularMediaNotas(float[] notas) {
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static float calcularMediaAritmetica(int[] array) {
        float soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma / array.length;
    }

	public static void imprimirMaiorMenorElemento(int[] arrayOrig) {
	}

    public static void imprimirElementosPares(int[] arrayOrig) {
    }

    public static void imprimirElementosImpares(int[] arrayOrig) {
    }

    public static void imprimirElementosPrimos(int[] arrayOrig) {
    }

    public static void imprimirArrayInverso(int[] arrayOrig) {
    }

    public static float calcularImc(float f, float g) {
        return 0;
    }
}
