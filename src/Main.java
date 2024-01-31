import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // EXERCICIO
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        // ARRAY 1
        System.out.println("Array 1 - Original: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Array 1 - Organizada: " + Arrays.toString(my_array1));

        // ARRAY 2S
        System.out.println("Array 2 - Original: " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Array 2 - Organizada: " + Arrays.toString(my_array2));

    }

        /***

        double value = (int) Math.round(Math.random() * 100); // PARA GERAR NUMERO RANDOMICO e ainda arredondar para o mais proximo TRANSFORMANDO PARA INT UTILIZANDO O CASTING
        System.out.println(value);

        double value = Math.round(Math.random() * 100); // PARA GERAR NUMERO RANDOMICO e ainda arredondar para o mais proximo
        System.out.println(value);

        double value = Math.random() * 100; // PARA GERAR NUMERO RANDOMICO *100 para ser unidade
        System.out.println(value);

        double value = Math.ceil(10.2); // PARA ARREDONDAR PARA CIMA
        System.out.println(value);

        double value = Math.floor(10.2); // PARA ARREDONDAR PARA BAIXO
        System.out.println(value);

        double value = Math.round(10.2); // PARA ARREDONDAR PARA O MAIS PROXIMO
        System.out.println(value);

        // CONVERTER STRING PARA INT
        String valorProduto = "10";
        int valorTotal = Integer.parseInt(valorProduto) + 2; // CONVERSÃO DE STRING PARA INTEGER
        System.out.println(valorTotal);

        // OPERADORES
        int a = (6 + 2) * 2; // A MULTIPLICAÇÃO ACONTECE PRIMEIRO
        System.out.println(a);

        (1º PARENTESES
        2º MULTIPLICAÇÃO E DIVISÃO
        3º SOMA E SUBTRAÇÃO)

         // INCREMENTO
        int a = 4;
        a++;
        System.out.println(a);

        // CASTING = FUSÃO
        double a = (double)4 / (double)3;
        System.out.println(a);

        // CONSTANTE
        final double taxaJuros = 11.92; // palavra FINAL - é uma constante

        // ARRAY MULTIDIMENCIONAL
        String [][] cars = {{"BMW", "Tesla"}, {"Jeep", "Fiat"}}; // adicionado mais 1 colchetes e separa os itens por chaves
        System.out.println(Arrays.deepToString(cars)); // trocar para ir mais a fundo

        String [] cars = {"BMW", "Tesla", "Jeep", "Fiat"};
        cars[2] = "Ferrari"; // para substituir um item no array
        System.out.println(Arrays.toString(cars)); // imprimi a array como String
        System.out.println(cars[2]); // para imprimir apenas o item desejado da array

        int [] valores = {10, 20, 15, 30, 40};
        Arrays.sort(valores); // para organizar a array
        System.out.println(Arrays.toString(valores)); // para imprimir o que esta dentro da array
        TAMANHO DA ARRAY System.out.println(valores.length); // para saber o tamanho da array
        ***/

        /***
         " "
         ''
         \n     pular linha
         \t     tab

         byte
         short
         int
         long
         char
         float
         double
         boolean

         ***/

    }
