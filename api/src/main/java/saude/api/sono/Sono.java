package saude.api.sono;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table (name = "sono")
@Data
@NoArgsConstructor
public class Sono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private LocalTime horasDormidas;
    @Column
    private QualidadeDoSono qualidadeDoSono;

    private boolean ativo;

    public Sono(CadastrarSono dados) {
        this.ativo = true;
        this.horasDormidas = LocalTime.parse(dados.horasDormidas().format(DateTimeFormatter.ofPattern("HH:mm")));
        this.qualidadeDoSono = dados.qualidadeDoSono();
    }

    public void AtualizarInformacoes(AtualizarSono dados) {
        if(dados.horasDormidas()!=null) {
            this.horasDormidas = LocalTime.parse(dados.horasDormidas().format(DateTimeFormatter.ofPattern("HH:mm")));
        }
        if(dados.qualidadeDoSono()!=null) {
            this.qualidadeDoSono = dados.qualidadeDoSono();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
