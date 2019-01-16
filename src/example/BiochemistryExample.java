package example;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;

public class BiochemistryExample {
	 
	public static void main(String[] args) {
		SimulationConfigurator simConfigurator = new SimulationConfigurator();
		simConfigurator.setModelFolder(System.getProperty("user.dir")+"//models");
		simConfigurator.setModel("Goldbeter_Koshland");
		simConfigurator.setEMFPersistence();
		simConfigurator.setViatraAsEngine(false);
		simConfigurator.setHybridPMC();
		simConfigurator.setStochasticSimulation();
		simConfigurator.setComplexTerminationCondition();
		Simulation viatraSim = simConfigurator.createSimulation();
		viatraSim.initializeClocked();
		viatraSim.runClocked();
		System.out.println(viatraSim.results());
		viatraSim.displayResults();
		viatraSim.finish();
		
		System.out.println(Runtimer.getInstance());
	}
	
}  
