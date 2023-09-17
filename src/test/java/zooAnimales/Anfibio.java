package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Anfibio extends Animal {
	private static List<Anfibio> listado= new ArrayList<>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
//	Constructor
	public Anfibio(String nombre,int edad, String habitat,String genero,Zona zona, String colorPiel, boolean venenoso) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		Anfibio.listado.add(this);
		}
	
	
	
	
	
	public Anfibio() {}
	
	
	


	public static List<Anfibio> getListado() {
		return listado;
	}





	public static void setListado(List<Anfibio> listado) {
		Anfibio.listado = listado;
	}





	public int getRanas() {
		return ranas;
	}





	public void setRanas(int ranas) {
		this.ranas = ranas;
	}





	public int getSalamandras() {
		return salamandras;
	}





	public void setSalamandras(int salamandras) {
		this.salamandras = salamandras;
	}





	public String getColorPiel() {
		return colorPiel;
	}





	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}





	public boolean isVenenoso() {
		return venenoso;
	}





	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}





	public int  cantidadAnfibios() {
		return listado.size();
	}

	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre,int edad,String genero,Zona zona) {
		new Anfibio(nombre,edad,"selva",genero,zona,"rojo",true);
		this.ranas++;
	}
	
	public void crearSalamandra(String nombre,int edad,String genero,Zona zona) {
		new Anfibio(nombre,edad,"selva",genero,zona,"negro y amarillo",false);
		this.salamandras++;
	}

}
