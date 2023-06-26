/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PRAC_EXAMEN.service.impl;

import com.PRAC_EXAMEN.db.IArbolRepository;
import com.PRAC_EXAMEN.entities.Arbol;
import com.PRAC_EXAMEN.service.IArbolService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArbolService implements IArbolService {
    private final IArbolRepository arbolRepository;
    public ArbolService(IArbolRepository arbolRepository) {
        this.arbolRepository = arbolRepository;
    }
    public List<Arbol> getAllArbols() {
        return (List<Arbol>) this.arbolRepository.findAll();
    }
    public void save(Arbol arbol) {
        arbol.setActivo(true);
        this.arbolRepository.save(arbol);
    }
    public void delete(Arbol arbol) {
        this.arbolRepository.delete(arbol);
    }
}