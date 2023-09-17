package gestion;
import java.util.List;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonaList = new ArrayList<Zona>();

//	Constructor 
	public Zoologico(String nombre, String ubicacion,  List<Zona> zonaList) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		this.zonaList=zonaList;
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
	public List<Zona> getZonaList() {
		return zonaList;
	}
	public void setZonaList(List<Zona> zonaList) {
		this.zonaList = zonaList;
	}
	public void agregarZonas(Zona zona) {
		this.zonaList.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int totalAnimales=0;
		for(int i=0; i< zonaList.size();i++) {
			totalAnimales+=zonaList.get(i).cantidadAnimales();
		}
		return totalAnimales;
		
	}
}
