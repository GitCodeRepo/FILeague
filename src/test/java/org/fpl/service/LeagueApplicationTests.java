package org.fpl.service;

import org.fpl.service.controller.LeagueController;
import org.fpl.service.model.Team;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeagueApplicationTests {
	@Mock
	LeagueController leagueController;

	Team team = new Team(101, "MI", 201, "FPL", 301, "INDIA", 1);

	@Test
	public void testAddTeam() throws Exception {
		Mockito.when(leagueController.addLeagueResult(Mockito.any(Team.class))).thenReturn(team);
	}

	@Test
	public void testDeleteTeam() throws Exception {
		Mockito.when(leagueController.deleteLeagueResult(Mockito.anyInt())).thenReturn(team.toString());
	}
}
