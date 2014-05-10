package org.katas.codebreaker;
import static org.junit.Assert.*;

import org.junit.Test;
import org.katas.codebreaker.Acceso;


public class AccesoTest {
	
	Acceso acceso = new Acceso();
	
	@Test
	public void entradaClaveErronea(){
		String resultado = acceso.verifica("AAAA");
		assertEquals("Valor no esperado", "", resultado );
		
	}
	
	@Test
	public void generaClaveLongitudOK(){
	    acceso.generaClave();
		assertEquals("Valor esperado",4,acceso.getClaveGenerada().length());
	}

	@Test
	public void generaClaveValoresAleatoriosOK(){
		acceso.generaClave();
		String clave = acceso.getClaveGenerada();
		acceso.generaClave();
		String clave2 = acceso.getClaveGenerada();
		assertNotEquals(clave,clave2);
	}
	
	@Test
	public void valoresClaveDentroRangoPermitidoOK(){
		acceso.generaClave();
		String claveGenerada = acceso.getClaveGenerada();
		boolean encontrada = true; 
		 for (int i = 0; i < claveGenerada.length(); i++) {
			 if (encontrada) encontrada = false;
			 else fail();
		   for (String element : acceso.getSecuenciaPermitidaClave()) {
			 if (claveGenerada.charAt(i) == element.charAt(0)) encontrada = true; 
		   }	
		 }
	}
}
