package br.com.mastertech.lanche;

import br.com.mastertech.lanche.principal.Usuario;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class LancheController {

    @GetMapping
    public String getLanche(@AuthenticationPrincipal Usuario usuario){
        return "Lanche do "+ usuario.getName();
    }
}
