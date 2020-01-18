package com.nubteam.inventario.controller;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Window;

public class MenuController extends GenericForwardComposer<Window>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5752312559979019049L;

	public void doAfterCompose(Window comp) {
		try {
			super.doAfterCompose(comp);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
	}
	
	public void onClick$fshBodegas() {
		Executions.sendRedirect("bodega.zul");
	}
	
	public void onClick$fshMovimientos() {
		Executions.sendRedirect("movimientos.zul");
	}
	
	public void onClick$fshExistencias() {
		Executions.sendRedirect("existencias.zul");
	}
	
	public void onClick$fshArticulos() {
		Executions.sendRedirect("articulos.zul");
	}
	
}
