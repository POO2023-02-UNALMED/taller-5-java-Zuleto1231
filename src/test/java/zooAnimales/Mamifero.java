package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Mamifero extends Animal{
private static List<Mamifero> listado =new ArrayList<>();
public int caballos;
public int leones;
private boolean pelaje;
private int patas;

//constructor


public Mamifero(String nombre,int edad, String habitat,String genero,Zona zona, boolean pelaje, int  patas) {
	this.setNombre(nombre);
	this.setEdad(edad);
	this.setHabitat(habitat);
	this.setGenero(genero);
	this.setZona(zona);
	this.pelaje=pelaje;
	this.patas=patas;
	Mamifero.listado.add(this);
}

public Mamifero() {}



public boolean isPelaje() {
	return pelaje;
}

public void setPelaje(boolean pelaje) {
	this.pelaje = pelaje;
}

public int getPatas() {
	return patas;
}

public void setPatas(int patas) {
	this.patas = patas;
}

public static List<Mamifero> getListado() {
	return listado;
}

public static void setListado(List<Mamifero> listado) {
	Mamifero.listado = listado;
}

public int cantidadMamiferos() {
return listado.size();
}

public void crearCaballo(String nombre,int edad,String genero,Zona zona) {
	new Mamifero(nombre,edad,"pradera",genero,zona,true,4);
	this.caballos+=1;
}

public void crearLeon(String nombre,int edad,String genero,Zona zona){
	new Mamifero(nombre,edad,"selva",genero,zona,true,4);
	this.leones+=1;
}



}
