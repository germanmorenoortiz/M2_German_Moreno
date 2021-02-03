package clases;

import enumeraciones.EProtocols;

/**
 * Clase hija que hereda de AppSoftware
 * Representa una Aplicación para dispositivos inteligentes 
 * de Internet de las cosas (Internet Of Things)
 * @author Oscar_german
 *
 */

public class AppIoT extends AppSoftware {
	
	
	private boolean hasGraphicalInterface;
	private boolean hasWifiAccess;
	private EProtocols protocolo;
	
	//CONSTRUCTOR
	
	public AppIoT(boolean hasGraphicalInterface, boolean hasWifiAccess, EProtocols protocolo, String lenguajeProgramacion, boolean persistencia, float complejidad, long lineasCodigo,
			int casosTest) {
		
		super(lenguajeProgramacion, persistencia, complejidad, lineasCodigo, casosTest);
		
		this.hasGraphicalInterface = hasGraphicalInterface;
		this.hasWifiAccess = hasWifiAccess;
		this.protocolo = protocolo;
		
	}
	
	
	//MÉTODOS
	
	
	@Override
	public void imprimirStack() {
		
		
	}
	
	
	//GETTERS AND SETTERS
	
		
	public boolean isHasGraphicalInterface() {
		return hasGraphicalInterface;
	}
	public void setHasGraphicalInterface(boolean hasGraphicalInterface) {
		this.hasGraphicalInterface = hasGraphicalInterface;
	}
	public boolean isHasWifiAccess() {
		return hasWifiAccess;
	}
	public void setHasWifiAccess(boolean hasWifiAccess) {
		this.hasWifiAccess = hasWifiAccess;
	}
	public EProtocols getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(EProtocols protocolo) {
		this.protocolo = protocolo;
	}
	
	//MÉTODO TOSTRING
	
	@Override
	public String toString() {
		return "AppIoT [hasGraphicalInterface=" + hasGraphicalInterface + ", hasWifiAccess=" + hasWifiAccess
				+ ", protocolo=" + protocolo + ", getLenguajeProgramacion()=" + getLenguajeProgramacion()
				+ ", isPersistencia()=" + isPersistencia() + ", getComplejidad()=" + getComplejidad()
				+ ", getLineasCodigo()=" + getLineasCodigo() + ", getCasosTest()=" + getCasosTest() + "]";
	}
	
	
	
	
}