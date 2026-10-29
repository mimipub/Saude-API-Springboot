package saude.api.refeicao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@Setter

@Entity
@Table(name="refeicoes")
@Data
@NoArgsConstructor
public class Refeicoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;
    @Column
    private TipoRefeicao tipo;
    @Column
    private Integer quantidade;
    @Column
    private LocalDate dataRegistro;

    private boolean ativo;

    public Refeicoes(CadastrarRefeicao refeicao) {
        this.ativo = true;
        this.nome = refeicao.nome();
        this.tipo = refeicao.tipo();
        this.quantidade = refeicao.quantidade();
        this.dataRegistro = refeicao.dataRegistro();
    }

    public void atualizarInformacoes(AtualizarRefeicao dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.tipo() != null) {
            this.tipo = dados.tipo();
        }
        if (dados.quantidade() != null) {
            this.quantidade = dados.quantidade();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
