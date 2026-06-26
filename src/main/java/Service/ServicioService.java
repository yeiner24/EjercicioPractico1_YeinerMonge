/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;



import domain.Servicio;
import java.util.List;

public interface ServicioService {

    List<Servicio> getServicios();

    void guardar(Servicio servicio);

    void eliminar(Servicio servicio);

    Servicio getServicio(Servicio servicio);
}