package restaurante;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class GoFood {
	
	private ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
	private ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();
	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
	public GoFood() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GoFood(ArrayList<Pedido> listaPedidos, ArrayList<Ingrediente> listaIngredientes,
			ArrayList<Cliente> listaClientes) {
		super();
		this.listaPedidos = listaPedidos;
		this.listaIngredientes = listaIngredientes;
		this.listaClientes = listaClientes;
	}

	public ArrayList<Pedido> getListaPedidos() {
		return listaPedidos;
	}
	public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
	
	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	public ArrayList<Ingrediente> getListaIngredientes() {
		return listaIngredientes;
	}

	public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
		this.listaIngredientes = listaIngredientes;
	}
	@Override
	public String toString() {
		return "GoFood [listaPedidos=" + listaPedidos + ", listaIngredientes=" + listaIngredientes + ", listaClientes="
				+ listaClientes + "]";
	}

	public void cargarIngredientesCSV() {
		
		File fichero = new File("ingredientes.csv");
		
		try {
			Scanner scanner = new Scanner(fichero);
			
			while(scanner.hasNextLine()) {
				String linea = scanner.nextLine();			
				
				String [] campo = linea.split(",");
				
				String nombre = campo[0];
				
				Double precio = Double.parseDouble(campo[1]);
				
				listaIngredientes.add(new Ingrediente(nombre, precio));
			}
			
			System.out.println(listaIngredientes);
			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Error al cargar ingredientes: " + e.getMessage());
		}
	}
	
}
