package educar.rs.exemplo_jpa.entitty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor

public class Time {
    @Id
    private Long id;
    private String nome;
    private int quantidadeTorcedores;
    private String estadio;
    private String tecnico;
    private int anoFundacao;

}
