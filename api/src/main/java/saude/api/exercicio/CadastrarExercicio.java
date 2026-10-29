package saude.api.exercicio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record CadastrarExercicio(
        String nome,
        Integer series,
        Integer repeticao,
        String carga,
        LocalDate data,
        LocalTime tempo
) {
}
