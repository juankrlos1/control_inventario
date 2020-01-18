package com.nubteam.inventario.controller;

import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Window;

public class MovimientoController extends GenericForwardComposer<Window>{
	
	public void doAfterCompose(Window com) { //todo lo que se ponga aqui dentro de va a ejecutar al ingresar al controlador
		try {
			super.doAfterCompose(com);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
