package br.com.mastertech.lanche.principal;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

import java.util.Map;

public class UsuarioPrincipalExtractor implements PrincipalExtractor {


    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        Usuario usuario = new Usuario();
        usuario.setName((String)map.get("name"));
        usuario.setId(Integer.parseInt((String)map.get("id")));
        return usuario;
    }
}
