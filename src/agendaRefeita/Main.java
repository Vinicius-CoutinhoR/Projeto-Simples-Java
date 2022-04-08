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
        System.out.println("Projeto de agenda simples em Java!");
        
        //Arraylist
        List<ContatosClasse> contatoLista = new ArrayList<>();
        
        //Criação do laço while que irá rodar em todo o programa.
        int seletor = 0;
        while(seletor != 5) {
        
        //Menu
        System.out.printf("Criar contato - 1\nExibir contato - 2\nEditar contato - 3\n"
                + "Remover Contato - 4\nFinalizar programa - 5\n");
            
        Scanner input = new Scanner(System.in);
        seletor = input.nextInt();
            
            //Criar contatos:
            if(seletor == 1) {
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
            } else if (seletor == 2) {
                
                System.out.println("Listando: ");
                
                int i;
                for(i = 0; i < contatoLista.size(); i++) {
                    System.out.println("Contato: " + i+1);
                    System.out.println(contatoLista.get(i));
                }
                
            //Edição:    
            } else if(seletor == 3) {
                
                System.out.println("Deseja editar qual contato? ");
                int escolhaDeContato = input.nextInt();
                
                    
                    
                
            //Remover Contato:    
            } else if (seletor == 4) {
                System.out.println("Deseja remover todos os contatos? [s/n]");
                String simNao = input.next();
                
                if(simNao.equalsIgnoreCase("s")) {
                    System.out.println("Removendo todos os contatos...");
                    contatoLista.removeAll(contatoLista);
                    
                } else {
                    System.out.println("Escolha o contato que deseja remover: ");
                    int escolhaDeContato = input.nextInt() - 1;
                    contatoLista.remove(escolhaDeContato);
                }
              
                 
            } else {
                System.out.println("Programa finalizado.");
            }
        }
    }
}
