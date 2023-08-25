package iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _022conversaobinaria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");

        int numero = teclado.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();

        while (numero > 0) {
            int digito = numero % 2;
            numero /= 2;
            lista.add(digito);
        }

        Collections.reverse(lista);
        System.out.println("Número em binário:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
        }
        teclado.close();
    }

}
