package org.fpl.service.dao;

import org.fpl.service.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamDao extends JpaRepository<Team, Integer> {

}
