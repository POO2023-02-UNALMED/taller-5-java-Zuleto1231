package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Ave extends Animal{
	private static List<Ave> listado =new ArrayList<>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
//constructor
	
	
	public Ave(String nombre,int edad, String habitat,String genero,Zona zona, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		this.colorPlumas=colorPlumas;
		Ave.listado.add(this);
	}
	
	public Ave() {}
	

	
public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

public static List<Ave> getListado() {
		return listado;
	}

	public static void setListado(List<Ave> listado) {
		Ave.listado = listado;
	}

public int cantidadAves() {
	return listado.size();
}
public String movimiento() {
	return "volar";
}
	
public void crearHalcon(String nombre,int edad, String habitat,String genero,Zona zona, String colorPlumas) {
	new Ave(nombre,edad,"montanas",genero,zona,"cafe glorioso");
	this.halcones++;
}

public void crearAguila(String nombre,int edad, String habitat,String genero,Zona zona, String colorPlumas){
	new Ave(nombre,edad,"montanas",genero,zona,"blanco y amarillo");
	this.aguilas++;
	
}
	


}
