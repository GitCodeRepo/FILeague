package org.fpl.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.fpl.service.controller.LeagueController;
import org.fpl.service.dao.TeamDao;
import org.fpl.service.model.Team;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeagueApplicationTests {
	@Mock
	LeagueController leagueController;

	@Mock
	TeamDao teamDao;

	Team team = new Team(101, "MI", 201, "FPL", 301, "INDIA", 1);
	String teamJson = "{\"teamsId\":101,\"teamsName\":\"INDIA\",\"leagueId\":301,\"leagueName\":\"FPL\",\"countryId\":201,\"countryName\":\"MI\",\"leaguePosition\":1}";

	@Test
	public void testAddTeam() throws Exception {
		Mockito.when(leagueController.addLeagueResult(Mockito.any(Team.class))).thenReturn(team);
	}
}
