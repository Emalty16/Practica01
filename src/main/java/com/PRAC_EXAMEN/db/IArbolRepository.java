/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PRAC_EXAMEN.db;

import com.PRAC_EXAMEN.entities.Arbol;
import org.springframework.data.repository.CrudRepository;


public interface IArbolRepository extends CrudRepository<Arbol, Integer> {
    
}
