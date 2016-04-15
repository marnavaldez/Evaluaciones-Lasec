/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contador;


/**
 * @author Alberto M. Valdez
 * @version 1.0
 * @created 15-abr.-2016 04:49:37 p. m.
 */
public class Palabra {
    /**
	 * Almacena la palabra que se desea contabilizar.
	 */
	private String palabra;
	/**
	 * Guarda las repeticiones de la palabra.
	 */
        private int repeticiones;

        
        // -- Getter y Setter --
        
        public String getPalabra() {
            return palabra;
        }

        public void setPalabra(String palabra) {
            this.palabra = palabra;
        }

        public int getRepeticiones() {
            return repeticiones;
        }

        public void setRepeticiones(int repeticiones) {
            this.repeticiones = repeticiones;
        }
        
        /**
	 * Metodo constructor, inicializa la variable palabra.
	 */
	public Palabra(String palabra){
            this.palabra = palabra;
	}

	/**
	 * Sobreescritura del método toString(), el cual retorna
         * la la palabra junto con el número de repeticiones.
	 */
	public String toString(){
		return this.palabra + ": " + this.repeticiones;
	}
}
