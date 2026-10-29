package saude.api.sono;

import java.time.LocalTime;

public record AtualizarSono(
        Long id,
        LocalTime horasDormidas,
        QualidadeDoSono qualidadeDoSono
) {
}
