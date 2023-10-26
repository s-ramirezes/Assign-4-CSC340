package com.CSC340SRE.crudAPP;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepo extends JpaRepository<Games, Integer> {
}
