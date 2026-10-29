package saude.api.exercicio;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record AtualizarExercicio(
        @NotNull
        Long id,
        LocalDate data,
        String nome,
        Integer series,
        Integer repeticao,
        String carga,
        LocalDateTime tempo
) {
}

