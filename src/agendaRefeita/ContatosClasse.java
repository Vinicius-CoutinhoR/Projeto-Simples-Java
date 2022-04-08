
package agendaRefeita;

public class ContatosClasse {
    
    String nome;
    String telefone;
    String email;
    String endereco;
    
    ContatosClasse(String nome, String telefone, String email, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        
        //return String.format(nome, args);
    }
    
    
    //Get setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    //Retornar em String:
    public String toString() {
        return "\nNome: " + this.nome + "\nTelefone: " + this.telefone + 
                "\nEmail: " + this.email + "\nEndereço: " + this.endereco + "\n";
    }
    
    
}
