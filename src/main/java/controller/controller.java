package controller;


import com.AlugaMeCar.AlugaMeCar.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;

@RestController
public class controller {
    public HashMap<Integer, Cliente>clientes = new HashMap<Integer, Cliente>();

    @PostMapping("/cliente")
    public Cliente adicionarCliente(@RequestBody Cliente c){
        clientes.put(c.getIdCliente(), c);
        return c;
    }

    @GetMapping("/cliente")
    public Collection<Cliente> verTodos(){
        return clientes.values();
    }

    @PutMapping("/cliente/{idCliente}")
    public Cliente atualizarCliente(@PathVariable("idCliente")int idCliente,@RequestBody Cliente c){
        return clientes.put(idCliente,c);
    }

    @DeleteMapping("/cliente/{idCliente}")
    public Cliente deletarCliente(@PathVariable("idCliente")int idCliente, @RequestBody Cliente c){
        return clientes.remove(idCliente);
    }
}
