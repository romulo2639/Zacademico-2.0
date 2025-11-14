package br.ifpe.zacademico.spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import br.ifpe.zacademico.model.Aluno;
import br.ifpe.zacademico.model.AlunoDAO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlunoController {
    
    private final AlunoDAO alunoDAO;

    public AlunoController(AlunoDAO alunoDAO) {
        this.alunoDAO = alunoDAO;
    }

    @GetMapping("/aluno")
    public String alunoForm(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "aluno"; // nome do template a ser renderizado
    }
}