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
        System.out.printf("Criar contato - 1\n Exibir contato - 2\n Editar contato - 3\n"
                + " Remover Contato - 4\n Finalizar o programa - 5");
        
        //Criação do laço while que irá rodar em todo o programa.
        int seletor = 0;
        
        while(seletor != 5) {
        Scanner input = new Scanner(System.in);
        seletor = input.nextInt();
            
            ArrayList<ContatosClasse> contatoLista = new ArrayList<>();
            
            if(seletor == 1) {
                String nome;
                String scanBug;
                
                System.out.println("Insira o nome: ");
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
                
                ContatosClasse contato = new ContatosClasse(nome, telefone, email, endereco);
                contatoLista.add(contato);
                System.out.println("Contato adicionado com sucesso!");
                
            } else if (seletor == 2) {
                System.out.println("Listando: ");
                for(int i = 0; i < contatoLista.size(); i++) {
                    System.out.println("Listando: 111 " + contatoLista.get(i));
                    
                    
                }
            }
        }
    }
}
