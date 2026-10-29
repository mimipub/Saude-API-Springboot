package saude.api.controller;

import saude.api.exercicio.AtualizarExercicio;
import saude.api.exercicio.CadastrarExercicio;
import saude.api.exercicio.Exercicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import saude.api.exercicio.ExercicioRepository;

import java.util.List;


@RestController
@RequestMapping("/exercicio")
public class ExercicioController {

    @Autowired
    private ExercicioRepository exercicioRepository;

    @GetMapping
    public List<Exercicio> listarExercicios() {
        return exercicioRepository.findAll();
    }

    @PostMapping
    public void cadastrarRefeicao(@RequestBody CadastrarExercicio dados) {
        exercicioRepository.save(new Exercicio(dados));
    }

    @PutMapping
    public void atualizarExercicio(@RequestBody AtualizarExercicio dados) {
        var exercicio = exercicioRepository.getReferenceById(dados.id());
        atualizarExercicio(dados);
    }

    public void excluirExercicio(@PathVariable Long id) {
        var exercicio = exercicioRepository.getReferenceById(id);
        exercicio.excluir();
    }
}
