package view;

import model.Filme;
import model.Ingresso;
import controller.FilmeDAO;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws SQLException {

        FilmeDAO filmes = new FilmeDAO();
        Filme filme01 = new Filme();

        Ingresso ingresso = new Ingresso();

        Scanner menu = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {

            System.out.print("|\n-------Cine Mais Ingresso-------|\n");
            System.out.print("|----------------------------------|\n");
            System.out.print("| Opção 1 - Comprar Ingresso       |\n");
            System.out.print("| Opção 2 - Cancelar Ingresso      |\n");
            System.out.print("| Opção 3 - Imprimir Ticket        |\n");
            System.out.print("| Opção 4 - Consultar Filmes/Dia   |\n");
            System.out.print("| Opção 5 - Verificar Vaga         |\n");
            System.out.print("| Opção 6 - Incluir Filme          |\n");
            System.out.print("| Opção 7 - Alterar Filme          |\n");
            System.out.print("| Opção 8 - Excluir Filme          |\n");
            System.out.print("| Opção 9 - Listar Filmes          |\n");
            System.out.print("| Opção 10 - Incluir Cinema        |\n");
            System.out.print("| Opção 11 - Alterar Cinema        |\n");
            System.out.print("| Opção 12 - Excluir Cinema        |\n");
            System.out.print("| Opção 13 - Listar Cinemas        |\n");
            System.out.print("| Opção 14 - Incluir Sessão        |\n");
            System.out.print("| Opção 15 - Alterar Sessão        |\n");
            System.out.print("| Opção 16 - Excluir Sessão        |\n");
            System.out.print("| Opção 17 - Listar Sessões        |\n");
            System.out.print("| Opção 18 - Incluir Sala          |\n");
            System.out.print("| Opção 19 - Alterar Sala          |\n");
            System.out.print("| Opção 20 - Excluir Sala          |\n");
            System.out.print("| Opção 21 - Listar Salas          |\n");
            System.out.print("| Opção 0 - Sair                   |\n");
            System.out.print("|----------------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 0) {
                System.out.print("\nAté logo!");
                menu.close();
                leitor.close();
            }

            switch (opcao) {
                case 1:
                    for(Filme f : filmes.getFilmes()) {
                        System.out.print("ID:" + f.getId());
                        System.out.print("Titulo:" + f.getTitulo());
                        System.out.print(" Duração" + f.getDuracao());
                        System.out.print(" Classificação" + f.getClassificacao());
                        System.out.print(" Descrição" + f.getDescricao());
                        System.out.print(" Diretor" + f.getDiretor());
                        System.out.print(" Ator Principal" + f.getAtorPrincipal());
                        System.out.print(" Categoria" + f.getCategoria());

                        System.out.println();
                    }
                    System.out.println("Qual o nome do filme que deseja comprar o ingresso?");
                    ingresso.setFilme(leitor.nextLine());
                    ingresso.setDataVenda(formatador.toString());
                    System.out.println("O Valor do Ingresso para esse Filme é:" + ingresso.getValor());
                    break;

                case 2:
                    ingresso.setCancelado(1);
                    System.out.print("\n Ingresso Cancelado com Sucesso!\n");
                    break;

                case 3:
                    System.out.print("\n Imprimir Ticket\n");
                    break;

                case 4:
                    System.out.print("\n Consultar Filmes\n");
                    break;

                case 5:
                    System.out.print("\n Verificar Vaga Disponível em uma Sala/Sessão\n");
                    break;

                case 6:
                    System.out.println("Titulo:");
                    filme01.setTitulo(leitor.nextLine());
                    System.out.println("Duracao:");
                    filme01.setDuracao(leitor.nextLine());
                    System.out.println("Classificacao:");
                    filme01.setClassificacao(leitor.nextLine());
                    System.out.println("Descricao:");
                    filme01.setDescricao(leitor.nextLine());
                    System.out.println("Diretor:");
                    filme01.setDiretor(leitor.nextLine());
                    System.out.println("Ator Principal:");
                    filme01.setAtorPrincipal(leitor.nextLine());
                    System.out.println("Categoria:");
                    filme01.setCategoria(leitor.nextLine());
                    filmes.createFilme(filme01);
                    break;

                case 7:
                    System.out.println("Indice do Filme a ser Alterado:");
                    filme01.setId(leitor.nextInt());
                    System.out.println("Novo Titulo:");
                    filme01.setTitulo(leitor.nextLine());
                    System.out.println("Nova Duracao:");
                    filme01.setDuracao(leitor.nextLine());
                    System.out.println("Nova Classificacao:");
                    filme01.setClassificacao(leitor.nextLine());
                    System.out.println("Nova Descricao:");
                    filme01.setDescricao(leitor.nextLine());
                    System.out.println("Novo Diretor:");
                    filme01.setDiretor(leitor.nextLine());
                    System.out.println("Novo Ator Principal:");
                    filme01.setAtorPrincipal(leitor.nextLine());
                    System.out.println("Nova Categoria:");
                    filme01.setCategoria(leitor.nextLine());
                    filmes.updateFilme(filme01);
                    break;

                case 8:
                    System.out.println("Indice do Filme a ser Apagado:");
                    int id = leitor.nextInt();
                    filmes.deleteFilme(id);
                    break;

                case 9:
                    System.out.println();
                    for(Filme f : filmes.getFilmes()) {
                        System.out.print("ID:" + f.getId());
                        System.out.print("Titulo:" + f.getTitulo());
                        System.out.print(" Duração" + f.getDuracao());
                        System.out.print(" Classificação" + f.getClassificacao());
                        System.out.print(" Descrição" + f.getDescricao());
                        System.out.print(" Diretor" + f.getDiretor());
                        System.out.print(" Ator Principal" + f.getAtorPrincipal());
                        System.out.print(" Categoria" + f.getCategoria());

                        System.out.println();
                    }
                    break;

                case 10:
                    System.out.print("\n Incluir Cinema\n");
                    break;

                case 11:
                    System.out.print("\n Alterar Cinema\n");
                    break;

                case 12:
                    System.out.print("\n Excluir Cinema\n");
                    break;

                case 13:
                    System.out.print("\nConsultar Cinemas\n");
                    break;

                case 14:
                    System.out.print("\n Incluir Sessão\n");
                    break;

                case 15:
                    System.out.print("\n Alterar Sessão\n");
                    break;

                case 16:
                    System.out.print("\n Excluir Sessão\n");
                    break;

                case 17:
                    System.out.print("\nConsultar Sessões\n");
                    break;

                case 18:
                    System.out.print("\n Incluir Sala\n");
                    break;

                case 19:
                    System.out.print("\n Alterar Sala\n");
                    break;

                case 20:
                    System.out.print("\n Excluir Sala\n");
                    break;

                case 21:
                    System.out.print("\nConsultar Salas\n");
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }

        /*
         * boolean result; ConnectionFactory conn = new ConnectionFactory(); FilmeDAO
         * filmeDao = new FilmeDAO(); Filme filmeAdd = new Filme("Teste", 150, 12,
         * "Descrição Teste", "Samuel", "Samuel L. Jackson", "Ação"); result =
         * filmeDao.addFilme(conn.getConn(), filmeAdd); if (result) {
         * System.out.println("Filme adicionado com sucesso!"); }
         * 
         * Filme filme = filmeDao.getFilme(Database.connect(), "Teste"); if (filme !=
         * null) { System.out.println(filme.getTitulo()); }
         */
    }

}
