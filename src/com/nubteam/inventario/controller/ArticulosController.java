package com.nubteam.inventario.controller;

import java.util.Iterator;

import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Window;

import com.nubteam.inventario.dao.ArticulosDAO;
import com.nubteam.inventario.pojo.ArticulosPOJO;

public class ArticulosController extends GenericForwardComposer<Window>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8959670751273626584L;
	Listbox lbxArticulos;
	
	public void doAfterCompose(Window comp) {
		try {
			super.doAfterCompose(comp);
			
			//Se llama al metodo listar articulos para llenar listbox al ingresar a la pantalla
			llenaListArticulos();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
	}
	
	public void llenaListArticulos() {
		
		ArticulosDAO objDao = new ArticulosDAO();
		
		Iterator<ArticulosPOJO> itArticulos = objDao.listArticulos().iterator();
		ArticulosPOJO objPojo = null;
		Listitem item = null;
		while(itArticulos.hasNext()) {
			objPojo = itArticulos.next();
			
			item = new Listitem();
			
			Listcell cell = new Listcell();
			cell.setLabel(objPojo.getArticulo());
			cell.setParent(item);
			
			Listcell cell2 = new Listcell();
			cell2.setLabel(objPojo.getDescripcion());
			cell2.setParent(item);
			
			Listcell cell3 = new Listcell();
			cell3.setLabel(objPojo.getEstado());
			cell3.setParent(item);
			
			Listcell cell4 = new Listcell();
			cell4.setLabel(objPojo.getTipo());
			cell4.setParent(item);
			
			Listcell cell5 = new Listcell();
			cell5.setLabel(objPojo.getFecha());
			cell5.setParent(item);
			
			item.setValue(objPojo);
			item.setParent(lbxArticulos);
			
			System.out.println("Llena listbox >> "+objPojo.getArticulo());
			
		}
	}

}
