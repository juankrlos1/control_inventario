package com.nubteam.inventario.dao;

import java.util.ArrayList;
import java.util.List;

import com.nubteam.inventario.pojo.ArticulosPOJO;

public class ArticulosDAO {

	
	public List<ArticulosPOJO> listArticulos(){
		
		//Se crea la lista que va a contener todos los articulos por medio de la clase POJO
		List<ArticulosPOJO> lsArticulos = new ArrayList<ArticulosPOJO>();
		
		for(int i = 1; i <= 5; i++) {
			ArticulosPOJO objArt = new ArticulosPOJO();
			
			objArt.setArticulo("Articulo "+i);
			objArt.setDescripcion("Articulo agregado desde lista con clase POJO");
			objArt.setEstado("Activo");
			objArt.setTipo("Juego de lucha");
			objArt.setFecha("0"+i+"/Enero/2020");
			
			//Se agrega objeto a lista
			lsArticulos.add(objArt);

			System.out.println("Se agrega articulo >> "+i);
		}
		
		return lsArticulos;
	}
	
}
