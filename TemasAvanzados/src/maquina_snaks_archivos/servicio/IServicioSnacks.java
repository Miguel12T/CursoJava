package maquina_snaks_archivos.servicio;

import maquina_snaks_archivos.dominio.Snack;

import java.util.List;

public interface IServicioSnacks {
   void agregarSnack(Snack snak);
   void mostrarSnacks();
   List<Snack> getSnacks();
}
