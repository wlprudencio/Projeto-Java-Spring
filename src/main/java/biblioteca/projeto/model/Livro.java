package biblioteca.projeto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "livro_Produto")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlivro", nullable = false, length = 50)
    private long idlivro;
    @Column(name = "titulo", nullable = false, length = 50)
    private String titulo;

    @Column(name = "sinopse", nullable = false, length = 50)
    private String sinopse;

    @Column(name = "autorDoLivro", nullable = false, length = 50)
    private String autorDoLivro;

    @Column(name = "editora", nullable = false, length = 50)
    private String editora;

    @Column(name = "estoqueDeLivro", nullable = false, length = 50)
    private int estoqueDeLivro;

    @Column(name = "valorDoLivro", nullable = false, length = 50)
    private int valorDoLivro;


}
