package com.cadastro.cadastro.DTO;

import com.cadastro.cadastro.model.Usuario;

public record UsuarioRequestDTO (
        String nome,
        String email,
        String telefone
){ public Usuario toEntity(){
    

}

}
