//package com.AlugaMeCar.AlugaMeCar.restController;
//
//
//import com.AlugaMeCar.AlugaMeCar.model.Cliente;
//import com.AlugaMeCar.AlugaMeCar.repository.ClienteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/clientes")
//public class ClienteRestController {
//    @Autowired
//    private ClienteRepository clienteRepository;
//    //    @GetMapping
////    public List<Cliente> listarClientes() {
////        return cliente.listarClientes();
////    }
//    @GetMapping("/{idCliente}")
//    public ResponseEntity<Cliente> buscarCliente(@PathVariable Long idCliente) {
//        Optional<Cliente> clientes = clienteRepository.findById(idCliente);
//        if (clientes.isPresent()) {
//            return ResponseEntity.ok(clientes.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//    @PostMapping("/")
//    public ResponseEntity<Cliente> adicionarCliente(@RequestBody Cliente cliente) {
//        Cliente novoCliente = clienteRepository.save(cliente);
//        return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente);
//    }
//    @PutMapping("/{idCliente}")
//    public ResponseEntity<Cliente> autualizarCliente(@PathVariable Cliente cliente) {
//        boolean clienteTrocado = false;
//        if (cliente.getIdCliente() > 0){
//            Cliente clienteAutualizar = clienteRepository.save(cliente);
//            clienteTrocado = true;
//        }
//        if (clienteTrocado) {
//            return ResponseEntity.ok(cliente);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//    @DeleteMapping("/{idCliente}")
//    public ResponseEntity<Void> removerCliente(@PathVariable Long idCliente){
//        boolean clienteRemovido = clienteRepository.findAll().remove(idCliente);
//        if (clienteRemovido) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//}
