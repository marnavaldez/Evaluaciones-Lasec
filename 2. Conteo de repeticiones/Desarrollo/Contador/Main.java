package Contador;


/**
 * @version 1.0
 * @created 15-abr.-2016 05:05:41 p. m.
 */
public class Main extends JFrame {

	/**
	 * Componente de la interfaz que crea el objeto Palabra  desde el texto capturado
	 * en txtPalabra.
	 */
	private JButton btnAgregar;
	/**
	 * Componente de la interfaz que indica donde se capturan las palabras a contar.
	 */
	private JLabel lblAgregarPalabras;
	/**
	 * Contiene la lista de objetos Palabra a contar.
	 */
	private DefaultListModel<Palabra> listaModel;
	/**
	 * Componente de la interfaz que muestra la lista en listaModel.
	 */
	private JList<Palabra> lstLista;
	/**
	 * Componente de la interfaz que permite hacer scroll en el txtArea.
	 */
	private JScrollPane scrollPane;
	/**
	 * Componente de la interfaz el cual contiene el texto ingresado por el usuario.
	 */
	private JTextArea txtArea;
	/**
	 * Componente de la interfaz en el que se captura la palabra a contar.
	 */
	private JTextBox txtPalabra;
	public Palabra m_Palabra;



	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * Metodo constructor, inicializa la variable palabra.
	 */
	public Main(){

	}

	/**
	 * Hace una actualización de los objetos Palabra contenidos en la lista listModel,
	 * y así mismo se ve reflejado el cambio en el componente lstLista.
	 * 
	 * @param indice
	 * @param contador
	 */
	public void actualizarLista(int indice, int contador){

	}

	/**
	 * Cuenta las repeticiones de la palabra en la lista indicada por el parametro
	 * "indice" y devuelve la cantidad en un entero.
	 * 
	 * @param indice
	 */
	public int contarPalabra(int indice){
		return 0;
	}

	/**
	 * Inicializa los componentes de la aplicación.
	 */
	public void initComponents(){

	}

	/**
	 * Inicializa la aplicación.
	 * 
	 * @param args
	 */
	public static void main(String[] args){

	}

	/**
	 * Manda llamar al método verificarTexto() cada vez que surja el evento
	 * DocumentEvent, el cúal es escuchado por setJTextAreaChanged().
	 * 
	 * @param docEvent
	 */
	public void manejarEvento(DocumentEvent docEvent){

	}

	/**
	 * Agrega un DocumentListener a la variable txtArea para monitorear el la
	 * escritura en la caja de texto, asi mismo con cada cambio se manda llamar al
	 * método manejarEvento().
	 * 
	 * @param txt
	 */
	public void setJTextAreaChanged(JTextArea txt){

	}

	/**
	 * Por cada palabra en la lista de palabras a contar, busca las repeticiones
	 * llamando al método contarPalabra().
	 * Manda llamar actualizarLista().
	 */
	public void verificarTexto(){

	}

}