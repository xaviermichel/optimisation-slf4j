package fr.xmichel.test.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.xmichel.test.Eleve;
import fr.xmichel.test.EleveService;

public class ProfilingEleveServiceTestCase {

	private static final int RUNNING_COUNT=3000;

	private static Logger logger = LoggerFactory.getLogger(ProfilingEleveServiceTestCase.class);
	
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EleveService eleveService = (EleveService) context.getBean("eleveService");
		
		long averageTime = 0;
		
		Eleve e = new Eleve("Mr", "Doe", "John", 22, 1.72, 68.2, tableOfInt(1, 10));
		
		for (int i=0; i<RUNNING_COUNT; ++i) {
			long start = System.currentTimeMillis();
			eleveService.passerExamen(e);
			averageTime += System.currentTimeMillis() - start;
		}
		
		logger.info("Time for {} tries : {} ms", RUNNING_COUNT, averageTime);
	}

	
	/**
	 * Génère un tableau de "size" cases qui ont toutes pour valeur "value"
	 */
	public int[] tableOfInt(int size, int value) {
		int table[] = new int[size];
		
		for (int i=0; i<size; ++i) {
			table[i] = value;
		}
		
		return table;
	}
}
