/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.slo.tecinfo.devweb.pi.controller;

import br.edu.ifsc.slo.tecinfo.devweb.pi.modelo.Evento;
import br.edu.ifsc.slo.tecinfo.devweb.pi.modelo.Organizador;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mateu
 */
@Controller
@RequestMapping("/eventos/")
public class EventoController {

   private List<Evento> eventos = new ArrayList<>();
   private EventoRepositorio EventoRepositorio;
 
    @Autowired
    private PlayerRepositorio PlayerRepositorio;

    @Autowired
    public EventoController(EventoRepositorio repositorio) {
        this.repositorio = repositorio;
    }


    @GetMapping("cadastrar")
    public String showSignUpForm(Evento , Model model) {
        
        List<Evento> eventoNoBanco = (List) eventoRepositorio.findAll();
        
        if(eventoNoBanco.isEmpty()){
            setEvento();
        }        
        model.addAttribute("evento", eventoRepositorio.findAll());
        return "add-player";
    }

    @GetMapping("mostrar")
    public String showUpdateForm(Model model) {
        model.addAttribute("players", repositorio.findAll());
        return "logado";
    }

    @PostMapping("add")
    public String addStudent(@Valid Evento evento, BindingResult result, Model model) {

        repositorio.save(evento);
        
        
        return "redirect:mostrar";
    }

    @GetMapping("editar/{evento}")
    public String showUpdateForm(@PathVariable("player") long player, Model model) {
        Evento evento = repositorio.findById(player)
				.orElseThrow(() -> new IllegalArgumentException("Nome de player inválido:" + player));
        model.addAttribute("evento", evento);
        model.addAttribute("player", payerRepositorio.findAll());
        return "update-player";
    }

    @PostMapping("update/{evento}")
    public String updateStudent(@PathVariable("player") long player, @Valid Evento evento, Model model) {

        repositorio.save(evento);
        return "redirect:/eventos/mostrar";
    }

    @GetMapping("apagar/{evento}")
    public String deleteStudent(@PathVariable("player") long evento, Model model) {
        Estudante evneto = repositorio.findById(player)
				.orElseThrow(() -> new IllegalArgumentException("Player inválido:" + player));
        repositorio.delete(evento);
        
        return "redirect:/eventos/mostrar";
    }

}
