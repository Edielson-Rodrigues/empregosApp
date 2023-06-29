package com.empregosApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empregosApp.models.Prestador;
import com.empregosApp.models.Candidato;
import com.empregosApp.models.Usuario;
import com.empregosApp.repository.CandidatoRepository;
import com.empregosApp.repository.PrestadorRepository;
import com.empregosApp.repository.UsuarioRepository;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Null;

@Controller
public class IndexController {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Autowired
    private PrestadorRepository prestadorRepository;

    @RequestMapping("/")
    public String index(){
        return "Index/index";
    }

    @GetMapping("/cadastrarCandidato")
    public String redirecionarCadastroCandidato(){
        return "Index/cadastrarCandidato";
    } 

    @GetMapping("/cadastrarPrestador")
    public String redirecionarCadastro(){
        return "Index/cadastrarPrestador";
    }

    @PostMapping("/salvarCandidato")
    public String salvarUsuario(@Valid Usuario usuario, BindingResult resultUsuario, 
                                    @Valid Candidato candidato, BindingResult resultCandidato){
                                        
        //Validando Entidades
        if(!resultUsuario.hasErrors() && !resultCandidato.hasErrors()){
            //Tentando Salvar no banco
            try{
                usuarioRepository.save(usuario);
                candidato.setIdCandidato(usuario.getId());
                candidatoRepository.save(candidato);   
                return "Pages Candidato/perfilCandidato";       
            //Capturando possíveis exceções 
            }catch(Exception ex){
                System.out.println("Error " +ex.getMessage());
                return "redirect:/cadastrarCandidato";
            }
        }
        else{
            return "redirect:/cadastrarCandidato";
        }
    }

    @PostMapping("/salvarPrestador")
    public String salvarPrestador(@Valid Usuario usuario, BindingResult resultUsuario,
                                    @Valid Prestador prestador, BindingResult resultPrestador){
        //Validando Entidades
        if(!resultUsuario.hasErrors() && !resultPrestador.hasErrors()){
            //Tentando Salvar no banco
            try{
                usuarioRepository.save(usuario);
                prestador.setIdPrestador(usuario.getId());
                prestadorRepository.save(prestador);
                return "Pages prestador/perfilPrestador";
            //Capturando possíveis exceções 
            }catch(Exception ex){
                System.out.println("Error " +ex.getMessage());
                return "redirect:/cadastrarPrestador";
            }
        }
        else{
            return "redirect:/cadastrarPrestador";
        }
    }
}