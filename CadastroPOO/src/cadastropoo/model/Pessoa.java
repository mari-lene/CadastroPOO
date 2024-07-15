package cadastropoo.model;

import java.io.Serializable;

/**
 *
 * @author Mari
 */
public class Pessoa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String nome;
    
    public Pessoa() {
        id = 0;
        nome = "";
    }
    
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void exibir() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
    }
    
    public long getSerialVersionUID() {
        return serialVersionUID;
    }
    
}
