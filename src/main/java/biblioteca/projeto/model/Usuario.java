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
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario", nullable = false, length = 50)
    private Long idusuario;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "senha", nullable = false, length = 50)
    private String senha;


}
