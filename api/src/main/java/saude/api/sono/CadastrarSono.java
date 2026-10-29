package saude.api.sono;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;

import java.time.LocalTime;

public record CadastrarSono(
        @NotNull
        LocalTime horasDormidas,
        @Enumerated(EnumType.STRING)
        QualidadeDoSono qualidadeDoSono
) {
}
