package br.com.itavema.itavema.controller;

import br.com.itavema.itavema.interfaces.Comissionado;
import br.com.itavema.itavema.models.Gerente;
import br.com.itavema.itavema.models.Vendedor;
import org.springframework.http.ResponseEntity;
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

    @GetMapping
    public ResponseEntity findAll() {
        if (comissaoList.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(comissaoList);
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity findOne(@PathVariable int id) {
        if (comissaoList.size() >= id) {
            return ResponseEntity.ok(comissaoList.get(id - 1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/create-vendedor")
    public ResponseEntity createVend(@RequestBody Vendedor vendedor) {
        comissaoList.add(vendedor);
        return ResponseEntity.created(null).build();
    }

    @PostMapping(value = "/create-gerente")
    public ResponseEntity createGerente(@RequestBody Gerente gerente) {
        comissaoList.add(gerente);
        return ResponseEntity.created(null).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteById(@PathVariable int id) {
        if (comissaoList.size() >= id) {
            comissaoList.remove(id - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
