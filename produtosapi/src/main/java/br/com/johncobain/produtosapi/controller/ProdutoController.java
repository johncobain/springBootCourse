package br.com.johncobain.produtosapi.controller;

import br.com.johncobain.produtosapi.model.Produto;
import br.com.johncobain.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        UUID uuid = UUID.randomUUID();
        produto.setId(uuid.toString());
        return produtoRepository.save(produto);
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable String id){
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable String id, @RequestBody Produto produto){
        produto.setId(id);
        return produtoRepository.save(produto);
    }

    @GetMapping
    public List<Produto> buscar(@RequestParam(required = false) String nome){
        if (nome != null) {
            return produtoRepository.findByNome(nome);
        }
        return produtoRepository.findAll();
    }
}
