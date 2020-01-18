package com.nubteam.inventario.controller;

import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Window;

public class BodegaController extends GenericForwardComposer<Window> {
	private static final long serialVersionUID = 5752312559979019049L;

	public void doAfterCompose(Window comp) {
		try {
			super.doAfterCompose(comp);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
	}
	

}
