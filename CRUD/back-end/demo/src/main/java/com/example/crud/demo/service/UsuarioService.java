package com.example.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.example.crud.demo.entity.Usuario;
import com.example.crud.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarPorId(@NonNull Integer id) {
        return usuarioRepository.findById(id);
    }

    public Usuario salvar(@NonNull Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(@NonNull Integer id) {
        usuarioRepository.deleteById(id);
    }

    public Optional<Usuario> atualizar(@NonNull Integer id, @NonNull Usuario usuarioAtualizado) {
        Optional<Usuario> usuarioExistenteOpt = usuarioRepository.findById(id);

        if (usuarioExistenteOpt.isEmpty()) {
            return Optional.empty();
        }

        Usuario usuarioExistente = usuarioExistenteOpt.get();
        usuarioExistente.setNome(usuarioAtualizado.getNome());
        usuarioExistente.setEmail(usuarioAtualizado.getEmail());
        usuarioExistente.setTelefone(usuarioAtualizado.getTelefone());
        usuarioExistente.setSenha(usuarioAtualizado.getSenha());
        usuarioExistente.setDataCadastro(usuarioAtualizado.getDataCadastro());

        return Optional.of(usuarioRepository.save(usuarioExistente));
    }

}
