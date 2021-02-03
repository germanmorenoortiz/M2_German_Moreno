package interfaces;

import clases.AppWeb;

/**
 * LAS INTERFACES SOLO DECLARAN.
 * @author Oscar_german
 *
 */

public interface AppWebService {
	
	public AppWeb createApp(String nameFrameworkBack, String nameFrameworkFront, String lenguajeProgramacion, boolean persistencia, float complejidad, long lineasCodigo,
			int casosTest); // declara pero NO implementa

	
}