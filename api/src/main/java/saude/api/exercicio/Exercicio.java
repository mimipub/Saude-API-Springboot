package saude.api.exercicio;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


@Entity
@Table(name = "exercicio")
@Data
@NoArgsConstructor
public class Exercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDate data;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Integer series;
    @Column(nullable = false)
    private Integer repeticao;
    @Column(nullable = false)
    private String carga;
    @Column(nullable = false)
    private LocalTime tempo;

    private boolean ativo;

    public Exercicio(CadastrarExercicio dados) {
        this.data = dados.data();
        this.nome = dados.nome();
        this.series = dados.series();
        this.repeticao = dados.repeticao();
        this.carga = dados.carga();
        this.tempo = LocalTime.from(LocalTime.parse(dados.tempo().format(DateTimeFormatter.ofPattern("HH:mm"))));
    }

    public void excluir() {
        this.ativo = false;
    }
}
