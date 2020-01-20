package dev.mission.exec;

import java.util.List;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

//@Controller
public class ListerMission implements Runnable {
	
	private MissionRepository missionRepository;
	
	

	/**
	 * @param missionRepository
	 */
	public ListerMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}



	@Override
	public void run() {
		List<Mission> liste = this.missionRepository.findAll();
		for (Mission m:liste){
			System.out.println(m.getId()+"-" + m.getDateDebut()+"-"+m.getDateFin()+"-"
					+m.getTauxJournalier());
		}
		
		
	}

}
