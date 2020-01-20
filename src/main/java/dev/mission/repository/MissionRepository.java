package dev.mission.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mission.entite.Mission;

public interface MissionRepository extends JpaRepository<Mission, Integer> {
	
	Mission findByDateDebut(LocalDate dateDebut);
	

}
