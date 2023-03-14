package br.gov.sp.fatec.springlabiv20231.service;

import br.gov.sp.fatec.springlabiv20231.entity.Usuario;
import java.util.List;

public interface IUsuarioService {
    
    public List <Usuario> buscarTodos();
    
    public Usuario novoUsuario(Usuario usuario);

    public Usuario buscarPorId(Long id);
}
