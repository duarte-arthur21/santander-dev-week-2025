package me.dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.domain.repository.UsuarioRepository;
import me.dio.domain.model.Usuario;
import me.dio.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new); 
    }

    @Override
    public Usuario create(Usuario userToCreate) {
        if (usuarioRepository.existsByNumeroConta(userToCreate.getConta().getNumero())) {
            throw new IllegalArgumentException("Conta já existe!");
        }
        return usuarioRepository.save(userToCreate); // Retornar o usuário criado
    }
    
}
