package biblioteca.projeto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", nullable = false, length = 50)
    public String nome;

    @Column(name = "cpf", nullable = false, length = 50)
    private Long cpf;

    @Column(name = "email", nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "senha", nullable = true, length = 50, unique = true)
    private Long senha;
    @Column(name = "id_genero", nullable = true, length = 50, unique = true)
    private  int  id_genero;

}

