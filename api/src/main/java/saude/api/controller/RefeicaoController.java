package saude.api.controller;

import jakarta.validation.Valid;
import saude.api.refeicao.AtualizarRefeicao;
import saude.api.refeicao.CadastrarRefeicao;
import saude.api.refeicao.Refeicoes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import saude.api.refeicao.RefeicaoRepository;

import java.util.List;

@RestController
@RequestMapping("/refeicao")
public class RefeicaoController {
    @Autowired
    private RefeicaoRepository refeicaoRepository;

    @GetMapping
    public List<Refeicoes> listarRefeicao() {
        return refeicaoRepository.findAll();
    }

    @PostMapping
    public void cadastrarRefeicao(@RequestBody @Valid CadastrarRefeicao refeicao) {
        refeicaoRepository.save(new Refeicoes(refeicao));
    }

    @PutMapping
    public void atualizarRefeicao(@RequestBody AtualizarRefeicao dados) {
        var refeicao = refeicaoRepository.getReferenceById(dados.id());
        refeicao.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    public void deletarRefeicao(@PathVariable Long id) {
        var refeicao = refeicaoRepository.getReferenceById(id);
        refeicao.excluir();
    }
}
