package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Pez extends Animal{
	private static List<Pez> listado= new ArrayList<>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
//	Constructores
	
	public  Pez(String nombre,int edad, String habitat,String genero,Zona zona,String colorEscamas, int  cantidadAletas) {
		
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		Pez.listado.add(this);
		
	}
	
	public  Pez() {}
	
	
	
	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public static List<Pez> getListado() {
		return listado;
	}

	public static void setListado(List<Pez> listado) {
		Pez.listado = listado;
	}

	public int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento() {
return "Nadar";
	}
	
	public void crearSalmon(String nombre,int edad,String genero,Zona zona) {
		new Pez(nombre,edad,"oceano",genero,zona,"rojo",6);
		this.salmones++;
	}
	
	public void crearBacalao(String nombre,int edad,String genero,Zona zona){
		new Pez(nombre,edad,"oceano",genero,zona,"gris",6);
		
	}
	
}
