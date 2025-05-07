package Assunto05.FilasEncadeadas.Filas;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        System.out.println("Informe um valor positivo para inserir na fila: ");
        int valor = le.nextInt();
        while (valor >=0){
            fila.enqueue(valor);
            System.out.println("Informe um valor positivo para inserir na fila: ");
            valor = le.nextInt();
        }
        System.out.println("Esvaziando a fila");
        while (!fila.isEmpty()){
            System.out.println("Valor retirado: "+fila.dequeue());
        }


        le.close();
    }
}
