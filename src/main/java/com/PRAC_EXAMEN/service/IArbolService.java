/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PRAC_EXAMEN.service;

import com.PRAC_EXAMEN.entities.Arbol;
import java.util.List;

public interface IArbolService {
    List<Arbol> getAllArbols();
    
    void save(Arbol product);

    void delete(Arbol product);
}
