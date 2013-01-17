package fr.xmichel.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EleveServiceImpl implements EleveService {

	private static final Logger logger = LoggerFactory.getLogger(EleveServiceImpl.class);
	
	@Override
	public int passerExamen(Eleve e) {
		logger.debug("L'eleve passe un examen...");
		
		// du code...
		logger.trace("Cet examen n'est pas facile !");
		// du code...
		
		int noteFinale = 10;
		
		e.addNote(noteFinale);
		
		logger.debug("On a obtenu la note : " + noteFinale);
		logger.trace("e vaut maintenant" + e);
		
		return noteFinale;
	}
}
