package org.katas.codebreaker;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Acceso {
	
	public static int LONGITUD_CLAVE = 4;
	private String claveGenerada;
	private List<String> secuenciaPermitidaClave = Arrays.asList("R","A","M","V","N","I");
	
	
	
	public String verifica(String string) {
		String resultado = "";
		return resultado;
	}

	public void generaClave() {
		
		List<String> listaAleatoria;
		listaAleatoria = this.genaraListaAleatoria(secuenciaPermitidaClave);
		this.claveGenerada = obtenerClave(listaAleatoria);
		
		
	}
	
	public String getClaveGenerada() {
		return claveGenerada;
	}
	
	public List<String> getSecuenciaPermitidaClave() {
		return secuenciaPermitidaClave;
	}

	private List<String> genaraListaAleatoria(List<String> list){
		
		Long seed = System.nanoTime();
		Collections.shuffle(list, new Random(seed));
		return list;
	}
	
	private String obtenerClave(List<String> list){
		StringBuffer clave = new StringBuffer();
		for(int i=0; i < this.LONGITUD_CLAVE; i++){
			clave.append(list.get(i));
		}
		return clave.toString();
	}

}
