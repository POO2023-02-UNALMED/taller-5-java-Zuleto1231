package gestion;
import java.util.List;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private  List<Zona> zonaList = new ArrayList<Zona>();

//	Constructor 
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
//	Constructor vacio
	public Zoologico() {}
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public List<Zona> getZona() {
		return zonaList;
	}
	public void setZona(List<Zona> zonaList) {
		this.zonaList = zonaList;
	}
	
	
	public void agregarZonas(Zona zona) {
		this.zonaList.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int totalAnimales=0;
		for(Zona zona: zonaList) {
			totalAnimales+=zona.cantidadAnimales();
		}
		return totalAnimales;
		
	}
}
