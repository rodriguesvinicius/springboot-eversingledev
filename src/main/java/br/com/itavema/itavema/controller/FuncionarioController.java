package br.com.itavema.itavema.controller;

import br.com.itavema.itavema.interfaces.Comissionado;
import br.com.itavema.itavema.models.Gerente;
import br.com.itavema.itavema.models.Vendedor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/funcionarios")
public class FuncionarioController {

    private List<Comissionado> comissaoList;

    public FuncionarioController() {
        this.comissaoList = new ArrayList<>();
    }

    @GetMapping(value = "/findall")
    public List<Comissionado> findAll() {
        return comissaoList;
    }

    @GetMapping(value = "/findone/{id}")
    public Comissionado findOne(@PathVariable int id) {
        return comissaoList.get(id - 1);
    }

    @PostMapping(value = "/create-vendedor")
    public void createVend(@RequestBody Vendedor vendedor) {
        comissaoList.add(vendedor);
    }

    @PostMapping(value = "/create-gerente")
    public void createGerente(@RequestBody Gerente gerente) {
        comissaoList.add(gerente);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable int id) {
        comissaoList.remove(id - 1);
    }
}
