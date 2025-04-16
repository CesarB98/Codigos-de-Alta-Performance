package assunto03_exercicio03;

import assunto03_exercicio02.Filas.FilaInt;

import java.util.Scanner;

public class AtendimentoDeAlunos {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        fila.init();
        Scanner le = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Insere o aluno na fila");
            System.out.println("2 - Retira o aluno da Fila para o atendimento");
            System.out.println("3 - Encerra atendimento");
            System.out.println("Opção: ");
            opcao = le.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o RM do aluno: ");
                    int rm = le.nextInt();
                    fila.enqueue(rm);
                    break;
                case 2:
                    if (fila.isEmpty()){
                        System.out.println("Não há alunos aguardando na fila.");
                    }else{
                        System.out.println("Próximo aluno a ser atendido: "+fila.dequeue());
                    }
                    break;
                case 3:
                    if (fila.isEmpty()){
                        System.out.println("Atendimento encerrado.");

                    }else {
                        System.out.println("Alunos ainda na fila. ");
                        opcao = 0;
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 3);
        le.close();
    }
}
