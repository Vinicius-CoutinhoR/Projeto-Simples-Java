package agendaRefeita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //Nome - Sobrenome
    //Telefone
    //email
    //endereço
    
    public static void main(String[] args) {
        System.out.println("A simple contact list in Java!");
        String scanBug;
        
        //Arraylist
        List<ContatosClasse> contactList = new ArrayList<>();
        
        //Criação do laço while que irá rodar em todo o programa.
        int seletor = 0;
        while(seletor != 5) {
        
        //Menu
        System.out.printf("Create contacts - 1\nList contacts - 2\nEdit contacts - 3\n"
                + "Remove contacts - 4\nEnd program - 5\n");
            
        Scanner input = new Scanner(System.in);
        seletor = input.nextInt();
            
            //Criar contatos:
            if(seletor == 1) {
                
                criaContato(input, contactList);
                
            } else if (seletor == 2) {
                
                listaContato(contactList, input);
                
            } else if(seletor == 3) {
                
                System.out.println("Deseja editar qual contato? ");
                int escolhaDeContato = input.nextInt();
                
                System.out.println("Deseja editar todo o contato? [s/n]");
                String simNao = input.next();
                
                if(simNao.equalsIgnoreCase("s")) {
                
                    System.out.println("Insira o nome: ");
                    String nome;
                    scanBug = input.nextLine();
                    nome = input.nextLine();

                    System.out.println("Insira o telefone: ");
                    String telefone;
                    telefone = input.nextLine();

                    System.out.println("Insira o email: ");
                    String email;
                    email = input.nextLine();

                    System.out.println("Insira o endereço: ");
                    String endereco;
                    endereco = input.nextLine();

                    ContatosClasse contato = new ContatosClasse(nome,telefone,email,endereco);

                    contactList.remove(escolhaDeContato);
                    contactList.add(escolhaDeContato, contato);
                    
                    System.out.println("Contato editado com sucesso!");
                    
                } else {
                    
                    /*Funcionalidade de alteração por atributos ainda não disponível*/
                    
                    int seletorAtributo;
                    System.out.println("Escolha um dos atributos para alterar: ");
                    System.out.println("Alterar nome - 1");
                    System.out.println("Alterar telefone - 2");
                    System.out.println("Alterar email - 3");
                    System.out.println("Alterar endereco - 4");
                    
                    ContatosClasse contato = new ContatosClasse();
                    //Entrada:
                    seletorAtributo = input.nextInt();
                    
                    if(seletorAtributo == 1) {
                        //System.out.println("Digite o novo nome: ");
                        //String nome = input.nextLine();
                        //contato.setNome(nome);
                        
                        
                    } else if (seletorAtributo == 2) {

                    } else if (seletorAtributo == 3) {
                        
                    } else if (seletorAtributo == 4) {
                        
                    }
                }
                
                
                
                    
                    
                
            //Remover Contato:    
            } else if (seletor == 4) {
                
                removeContato(input, contactList);
              
            } else {
                
                encerraPrograma();
                
            }
        }
    }

    private static void encerraPrograma() {
        System.out.println("Programa finalizado.");
    }

    private static void removeContato(Scanner input, List<ContatosClasse> contatoLista) {
        System.out.println("Deseja remover todos os contatos? [s/n]");
        String simNao = input.next();
        
        if(simNao.equalsIgnoreCase("s")) {
            System.out.println("Removendo todos os contatos...");
            contatoLista.removeAll(contatoLista);
            
        } else {
            System.out.println("Escolha o contato que deseja remover: ");
            int escolhaDeContato = input.nextInt() - 1;
            contatoLista.remove(escolhaDeContato);
            System.out.println("Contato removido com sucesso!");
        }
    }

    private static void listaContato(List<ContatosClasse> contatoLista, Scanner input) {
        if(contatoLista.size() == 0) {
            
            System.out.println("A agenda não posssui contatos.");
            
        } else {
            System.out.println("Você deseja listar todos os contatos? [s/n]");
            String simNao;
            simNao = input.next();
            
            if(simNao.equalsIgnoreCase("s")) {
                System.out.println("Listando contatos: ");
                int i;
                int j = 1;
                
                //Tive que usar o int j porque estava bugando ao utilizar o i+1 para exibir
                //O contato, "Contato 01" depois "Contato 11" usando o J corrigiu esse problema.
                for(i = 0; i < contatoLista.size(); i++) {
                    System.out.println("Contato ID: " + j);
                    System.out.println(contatoLista.get(i));
                    j++;
                }
                
            } else {
                System.out.println("Digite o id do contato que deseja buscar: ");
                int escolhaDeContato;
                escolhaDeContato = input.nextInt() - 1;
                
                System.out.println(contatoLista.get(escolhaDeContato));
            }
        }
        
        //Edição:    
    }

    public static void criaContato(Scanner input, List<ContatosClasse> contatoLista) {
        String scanBug;
        System.out.println("Insira o nome: ");
        String nome;
        scanBug = input.nextLine();
        nome = input.nextLine();
        System.out.println("Insira o telefone: ");
        String telefone;
        telefone = input.nextLine();
        System.out.println("Insira o email: ");
        String email;
        email = input.nextLine();
        System.out.println("Insira o endereço: ");
        String endereco;
        endereco = input.nextLine();
        ContatosClasse contato = new ContatosClasse(nome,telefone,email,endereco);
        contatoLista.add(contato);
        System.out.println("Contato adicionado com sucesso!");
        
        //Listagem:    
    }
}
