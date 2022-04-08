package agendaRefeita;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Nome - Sobrenome
    //Telefone
    //email
    //endereço
    
    public static void main(String[] args) {
        System.out.println("Projeto de agenda simples em Java!");
        
        //Arraylist
        ArrayList<ContatosClasse> contatoLista = new ArrayList<>();
        
        //Criação do laço while que irá rodar em todo o programa.
        int seletor = 0;
        while(seletor != 5) {
        
        //Menu
        System.out.printf("Criar contato - 1\n Exibir contato - 2\n Editar contato - 3\n"
                + " Remover Contato - 4\n Finalizar o programa - 5");
            
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
                
            } else if (seletor == 2) {
                
                System.out.println("Listando: ");
                int i;
                System.out.println(contatoLista.size());
                
                
                for(ContatosClasse contatos : contatoLista){
                    System.out.println(contatoLista);
                }
            }
        }
    }
}
