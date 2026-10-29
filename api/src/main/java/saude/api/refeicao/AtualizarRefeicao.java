package saude.api.refeicao;

import java.time.LocalDate;

public record AtualizarRefeicao(
        Long id,
        String nome,
        TipoRefeicao tipo,
        Integer quantidade,
        LocalDate dataRegistro
) {
}
