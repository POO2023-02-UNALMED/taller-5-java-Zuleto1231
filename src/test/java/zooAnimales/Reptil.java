package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Reptil extends Animal {
	private static List<Reptil> listado =new ArrayList<>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
//constructor
	
	
	public Reptil(String nombre,int edad, String habitat,String genero,Zona zona,String colorEscamas, int  largoCola) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		Reptil.listado.add(this);
	}
	
	public Reptil() {}
	
	
	
public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

public static List<Reptil> getListado() {
		return listado;
	}

	public static void setListado(List<Reptil> listado) {
		Reptil.listado = listado;
	}

public int cantidadReptiles() {
	return listado.size();
}
@Override
public String movimiento() {
	return "reptar";
}
	
public void crearIguana(String nombre,int edad,String genero,Zona zona) {
	new Reptil(nombre,edad, "humedal",genero,zona,"verde",3);
	this.iguanas++;
	
}

public void crearSerpiente(String nombre,int edad,String genero,Zona zona){
	new Reptil(nombre,edad, "jungla",genero,zona,"blanco",1);
}
	

}
