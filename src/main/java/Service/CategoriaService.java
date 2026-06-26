/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import domain.Categoria;
import java.util.List;

public interface CategoriaService {

    List<Categoria> getCategorias();

    void guardar(Categoria categoria);

    void eliminar(Categoria categoria);

    Categoria getCategoria(Categoria categoria);
}