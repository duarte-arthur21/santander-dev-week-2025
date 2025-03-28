package me.dio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import me.dio.domain.model.Usuario;
import java.net.URI;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import me.dio.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        var user = usuarioService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario usertoCreate) {
        var userCreated = usuarioService.create(usertoCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
