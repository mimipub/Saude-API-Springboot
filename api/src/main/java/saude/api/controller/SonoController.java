package saude.api.controller;

import org.springframework.transaction.annotation.Transactional;
import saude.api.sono.AtualizarSono;
import saude.api.sono.CadastrarSono;
import saude.api.sono.Sono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import saude.api.sono.SonoRepository;

import java.util.List;

@RestController
@RequestMapping("/sono")
public class SonoController {

    @Autowired
    private SonoRepository sonoRepository;

    @GetMapping
    public List<Sono> listarSono() {
        return sonoRepository.findAll();
    }

    @PostMapping
    public void salvarSono(@RequestBody CadastrarSono dados) {
        sonoRepository.save(new Sono(dados));
    }

    @PutMapping
    public void atulizarSono(@RequestBody AtualizarSono dados) {
        var sono = sonoRepository.getReferenceById(dados.id());
        sono.AtualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletarSono(@PathVariable Long id) {
        var sono = sonoRepository.getReferenceById(id);
        sono.excluir();
    }
}
