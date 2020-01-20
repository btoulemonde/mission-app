package dev.mission.exec;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
public class RechercherMissionParDateDebut implements Runnable {
	
	private MissionRepository MissionRepository;
	
	

	/**
	 * @param missionRepository
	 */
	public RechercherMissionParDateDebut(dev.mission.repository.MissionRepository missionRepository) {
		super();
		MissionRepository = missionRepository;
	}



	@Override
	public void run() {
		LocalDate dateDebutRecherche = LocalDate.of(2019, 1, 1);
		Mission m = this.MissionRepository.findByDateDebut(dateDebutRecherche);
		System.out.println(m.getId()+"-" + m.getDateDebut()+"-"+m.getDateFin()+"-"
				+m.getTauxJournalier());
	}

}
