//import java.util.Scanner;

public class Praticar{
    public static void main(String[] args) {
        
        /**treino de manipulacao de string
        *esse display pode ser alterado...
        *meu display: oi nome, hoje eh dia da semana, bom dia/boa tarde/boa noite
        */
        //String nome = "Loyde";
        //iso 8601
        //esse LocalDate vai permitir pegar o horario local/data/dia da semana
        //LocalDate hoje = LocalDate.now();
        //confg da lingua que vai printar o dia da semana
        //Locale brasil = new Locale("pt", "BR");
        //dia da semana
        //String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        //saudacao
        //String saudacao;
        //horario/data local
        //LocalDateTime agora = LocalDateTime.now();
        //decisao de qual sera a saudacao considerando o horario/data local
        /* if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 17){
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite";
        } else{
            saudacao = "bem vindo";
        }
        System.out.printf("Ola %s, hoje eh %s, %s %n", nome, diaDaSemana, saudacao);
         */

        /*
        *estruturas de repeticao (lacos for)
        *tabuada de 1 a 10 com java
          */
          
        /* for (int i = 1; i <= 10; i++) {
           for (int j = 1; j <=10 ; j++) {
                System.out.println(i + "x" + j + "=" + i*j);
               System.out.printf("%d x %d = %d \n", i, j, i*j);
          }
            System.out.println("\n");
        } */

        //vetores em java
        //declaracao de um vetor
       // int[] numbers = new int[6];
        // new int[] eh a declaracao do tam do vetor

        // essa eh uma maneira de declarar vetores em java
       /*  numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
    */
        // independente da maneira de declarar vetores, vamos printar os elementos usandos lacos for
       // for (int i = 0; i < numbers.length; i++) {
           // System.out.println(numbers[i]);
            //System.out.printf("%d ", numbers[i]);
     //   }

        //aqui vai outra maneira de declarar vetores em java, quando ja se sabe quais elementos vai usar
        //int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //for (int i = 0; i < numbers.length; i++) {
            // System.out.println(numbers[i]);
            //System.out.printf("%d ", numbers[i]);
             //  }

        //vetor do tipo string
        //String[] letters = {"A", "B", "c", "d", "E", "f"};
        //for (int i = 0; i < letters.length; i++) {
            // System.out.println(letters[i]);
          //  System.out.printf("%s ", letters[i]);
           // }
        //System.out.println("\n");
        //System.out.println(Arrays.toString(letters)); //essa forma de printar array esta
        //ligada ao import java.util.Arrays, pois eh ele que permite essa representacao diferente

        
        /* Scanner input = new Scanner(System.in);

        System.out.println("Simplificando um código.");
        System.out.println("Digite um número");
        int number = input.nextInt();

       if (number > 10){
            System.out.println("O número digitado é maior que 10.");
        } else if (number == 10){
           System.out.println("O número digitado é igual que 10.");
       } else {
            System.out.println("O número digitado é menor que 10.");
        } */


        /* 
        *tabuada inversa
        
            System.out.print("Digite a tabuada que deseja ver: ");
            Scanner input = new Scanner(System.in);
            int numTabuada = input.nextInt();
            
            System.out.printf("Tabuada de %d \n", numTabuada);
            
            for(int i = 10; i >= 1; i--){
            System.out.printf("%d x %d = %d \n",numTabuada, i, numTabuada*i);
        } */


       /* *A soma de um intervalo númerico */
/*
        System.out.println("Digite o inicio da contagem:");
        Scanner in = new Scanner(System.in);
        //recebe o inicio da contagem
        int contagInicio = in.nextInt();

        System.out.println("Digite o fim da contagem:");
        //recebe o fim da contagem
        int contagFim = in.nextInt();

        int soma = 0;

        while (contagInicio <= contagFim){
            soma+=contagInicio;
            contagInicio++;

        }
        System.out.printf("A soma do intervalo é igual a: %d", soma);
   */

        //aqui a função soma de algarismos sera aplicada....
        //soma dos algarismos de um número
        //programa para o numero a ter os algarismos somados foi transformado em função
        //mas primeiro vamos saber quais serão os valores nesse escopo
        //recebendo valores
        //System.out.print("digite um numero:");
        //Scanner in = new Scanner(System.in);
       // int number = in.nextInt();

        //chamando a função e atribuindo o valor dela a uma variavel
        //int resultado = somaDeAlgarismos(number);
        //System.out.printf("\nA soma dos algarismos inseridos é igual a %d",resultado);

        /*Pratica de funções*/
    
/* 
 *função para fazer o numero a ter os algarismos somados
 public static int somaDeAlgarismos(int num){
     //transformando valor em string
     String numS = Integer.toString(num);
     //criando array do inteiros
     int[] numArray = new int[numS.length()];

     //loop para fazer conversão de string para numero e atribuição aos respectivos indices
     //de acordo com o tamanho do numero
     for (int i = 0; i < numS.length() ; i++) {
         numArray[i] = numS.charAt(i) - '0';
     }
     //loop para ver os valores organizados em array
     for (int j = 0; j < numArray.length; j++) {
         System.out.printf("[%d] = %d", j, numArray[j]);
     }
     // criar a variavel para fazer a soma dos algarismos
     int soma = 0;

     //loop para executar a soma
     for (int k = 0; k < numArray.length; k++) {
         soma+=numArray[k];
     }
     return soma;
 }
*/
}
}