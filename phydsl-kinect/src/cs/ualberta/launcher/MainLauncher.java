package cs.ualberta.launcher;

import java.io.IOException;

import edu.ca.ualberta.ssrg.chaintracker.acceleo.main.AcceleoLauncherException;

public class MainLauncher {
	public static void main(String ... args) throws IOException, AcceleoLauncherException {
				
		Launcher launcher = new Launcher();
		
		
		launcher.runAcceleo("metamodels/Phydsl.ecore", "Phydsl", "models/AlienMiner.xmi",
				"transformations/M2T/generate.mtl", "gen/");
	}
}
