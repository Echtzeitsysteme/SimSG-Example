package example;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;


/**
 * This is a small example from the biochemistry domain. It is called the Golbeter-Koshland loop
 * and is an important mechanism in signal pathways (e.g. EGF-Pathway).
 * 
 * The result should look like an oscillating signal, which implies activation and deactivation of molecular sites in a cyclic manner.
 * 
 * @author sehmes
 *
 */
public class BiochemistryExample {
	 
	public static void main(String[] args) {
		SimulationConfigurator simConfigurator = new SimulationConfigurator();
		// Set the root folder where simulation models are stored.
		simConfigurator.setModelFolder(System.getProperty("user.dir")+"//models");
		// Set the model by using the ModelID defined in the *.ssgl file
		simConfigurator.setModel("Goldbeter_Koshland");
		simConfigurator.setEMFPersistence();
		// Here you can chose which pattern matching tool should be used. This could also be Democles instead of Viatra.
		// Democles is deactivated at the moment, but will be back soon.
		simConfigurator.setViatraAsEngine(false);
		// "Hybrid Pattern Matching" is a trick to speed up pattern matching, when disjunct patterns are involved. 
		// This is work in progress but works pretty good in this case.
		simConfigurator.setHybridPMC();
		// Sets the type of simulation. Stochastic Simulation -> Gillespie's Algorithm
		simConfigurator.setStochasticSimulation();
		// When this is set, termination conditions defined in the model are used.
		simConfigurator.setComplexTerminationCondition();
		// This creates a runnable  simulation instance
		Simulation viatraSim = simConfigurator.createSimulation();
		// Methods with the "clocked" suffix have their runtime measured.
		viatraSim.initializeClocked();
		viatraSim.runClocked();
		System.out.println(viatraSim.results());
		// This calls a visualization of the tracked patterns.
		viatraSim.displayResults();
		viatraSim.finish();
		
		// Here we can get the measured runtimes
		System.out.println(Runtimer.getInstance());
	}
	
}  
