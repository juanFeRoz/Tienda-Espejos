package com.uis.proyectoespejos.Servicio;
import com.uis.proyectoespejos.Modelo.Espejo;
import java.util.List;

public interface IEspejoService {

    List<Espejo> getEspejo();
    Espejo nuevoEspejo(Espejo espejo);
    Espejo buscarEspejo(Long id);
    int borrarEspejo(Long id);
}
