/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PRAC_EXAMEN.controller;

import com.PRAC_EXAMEN.entities.Arbol;
import com.PRAC_EXAMEN.service.IArbolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ArbolController {
    private final IArbolService arbolService;
    public ArbolController(IArbolService arbolService) {
        this.arbolService = arbolService;
    }
    @GetMapping("/arbol")
    public String index(Model model) {
        model.addAttribute("arbol", new Arbol());
        model.addAttribute("arbols", this.arbolService.getAllArbols());
        return "product";
    }
    @PostMapping("arbol/save")
    public String save(@ModelAttribute("arbol") Arbol arbol) {
        this.arbolService.save(arbol);
        return "redirect:/arbol";
    }
    @PostMapping("arbol/delete")
    public ResponseEntity<String> delete(@RequestBody Arbol arbol) {
        this.arbolService.delete(arbol);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
