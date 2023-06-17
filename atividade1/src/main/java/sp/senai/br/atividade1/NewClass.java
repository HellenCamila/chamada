/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.atividade1;

import java.util.ArrayList;
import java.util.Scanner;
import static sp.senai.br.atividade1.NewClass.alunos;

/**
 *
 * @author aluno
 */
public class NewClass {
    
  
    
    
     public static String[] alunos = new String[10];

 

        Scanner teclado = new Scanner(System.in);

 
     public static void main(String[] args) {
        ArrayList<String> listaAlunos = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int presencas = 0;
        int totalAlunos = 0;
        double porcentagemAlunos;

        while (opcao != 5) {
            System.out.println("_______________________________ ");
            System.out.println("            Menu               |");
            System.out.println("_______________________________|");
            System.out.println("------------------------------- ");
            System.out.println("    1. Adicionar aluno         |");
            System.out.println("------------------------------ |");
            System.out.println("    2. Exibir chamada          |");
            System.out.println("------------------------------ |");
            System.out.println("    3. Remover aluno           |");
            System.out.println("------------------------------ |");
            System.out.println("    4. Fazer chamada           |");
            System.out.println("------------------------------ |");
            System.out.println("    5.Sair                     |");
            System.out.println("_______________________________|");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                
                case 1:
                    System.out.println("Quantos alunos deseja adicionar? ");
                    int quantidadeAlunos = scanner.nextInt();
                    for (int i = 0; i < quantidadeAlunos; i++) {
                        System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
                        String nomeAluno = scanner.next();
                        listaAlunos.add(nomeAluno);
                        totalAlunos++;
                    }
                    System.out.println("Alunos adicionados com sucesso!");
                    break;
                
                case 2:
                    System.out.println("Lista de chamada:");
                    for (String aluno : listaAlunos) {
                        System.out.println(aluno);
                    }
                    break;
                
                case 3:
                    System.out.println("Digite o nome do aluno a ser removido: ");
                    String alunoRemovido = scanner.next();
                    if (listaAlunos.contains(alunoRemovido)) {
                        listaAlunos.remove(alunoRemovido);
                        totalAlunos--;
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado na lista!");
                    }
                    break;
                
               case 4:
                    System.out.println("Fazendo a chamada:");
                    presencas = 0;
                    for (String aluno : listaAlunos) {
                        System.out.println(" \n Presente? (S/N): \n" + aluno);
                        String resposta = scanner.next();
                        if (resposta.equalsIgnoreCase("S")) {
                            System.out.println("Aluno " + aluno + " presente.");
                            presencas++;
                        } else {
                            System.out.println("Aluno " + aluno + " ausente. \n");
                        }
                    }
                    System.out.println("Presenças: " + presencas);
                    System.out.println("Total de alunos: " + totalAlunos);
                    double porcentagemPresenca = 0.0;
                    if (totalAlunos > 0) {
                        porcentagemPresenca = (double) presencas / totalAlunos * 100;
                    }
                    System.out.printf("Porcentagem de presença: %.2f%%\n", porcentagemPresenca);
                    break;

              
                        case 5:
                            System.out.println("Saindo do programa...");
                            break;
                            default:
                            System.out.println("Opção inválida. Tente novamente.");
                             break;
            }
        }
    }
    }

   