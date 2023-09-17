package zooAnimales;

import java.util.ArrayList;
import java.util.List;


public class Mamifero extends Animal{
private static List<Mamifero> listado =new ArrayList<>();
public static int caballos;
public static int leones;
private boolean pelaje;
private int patas;

//constructor


public Mamifero(String nombre,int edad, String habitat,String genero, boolean pelaje, int  patas) {
	this.setNombre(nombre);
	this.setEdad(edad);
	this.setHabitat(habitat);
	this.setGenero(genero);
	this.pelaje=pelaje;
	this.patas=patas;
	Mamifero.listado.add(this);
}

public Mamifero() {
	Mamifero.listado.add(this);
	
}



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

public static Animal crearCaballo(String nombre,int edad,String genero ) {
	Mamifero.caballos+=1;
	return new Mamifero(nombre,edad,"pradera",genero,true,4);
}

public static Animal crearLeon(String nombre,int edad,String genero ){
	Mamifero.leones+=1;
	return new Mamifero(nombre,edad,"selva",genero,true,4);
}



}
