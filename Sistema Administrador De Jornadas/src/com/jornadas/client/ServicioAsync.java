package com.jornadas.client;

import java.util.Collection;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.jornadas.shared.actividad.Actividad;
import com.jornadas.shared.actividad.Area;
import com.jornadas.shared.actividad.Tarea;
import com.jornadas.shared.actividad.TipoActividad;
import com.jornadas.shared.usuario.Usuario;

public interface ServicioAsync {

	public void obtenerUsuario(String DNI, String ID, AsyncCallback<Usuario> Respuesta);
	
	public void registrarAsistente(String ID, AsyncCallback<String> Respuesta);
	
	public void actualizarUsuario(Usuario usuario, AsyncCallback<Boolean> Respuesta);
	
	public void obtenerIDNuevaArea(AsyncCallback<Integer> Respuesta);
	
	public void obtenerUsuarios(AsyncCallback<Collection<Usuario>> Respuesta);
	
	public void obtenerTiposDeActividades(AsyncCallback<Collection<TipoActividad>> Respuesta);
	
	public void agregarArea(Area NuevaArea, AsyncCallback<Boolean> Respuesta);
	
	public void modificarArea(Area AreaModificada, AsyncCallback<Boolean> Respuesta);
	
	public void agregarActividad(Actividad NuevaActividad, AsyncCallback<String> Respuesta);
	
	public void agregarTarea(Tarea NuevaTarea, AsyncCallback<String> Respuesta);
}
