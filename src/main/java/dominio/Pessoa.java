package dominio;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Pessoa implements Serializable {

//    No projeto do instrutor o compilador pediu este ID,
//    mas aqui só criei para ficar igual.
//    Mesmo comentando a linha não dá erro.
//    private static final long serialVersionID = 1L;

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nomecompleto")
    private String nome;
    private String email;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
