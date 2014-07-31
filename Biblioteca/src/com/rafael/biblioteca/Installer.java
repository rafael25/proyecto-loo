/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafael.biblioteca;

import java.io.IOException;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {
	
	@Override
	public boolean closing() {
		try {
			BibliotecaDB.getInstance().close();
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		}
		
		return true;
	}

}
