package saude.api.refeicao;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record CadastrarRefeicao(
        @NotBlank
        String nome,
        @Enumerated(EnumType.STRING)
        TipoRefeicao tipo,
        @NotNull
        Integer quantidade,
        @NotNull
        LocalDate dataRegistro
) {
}
