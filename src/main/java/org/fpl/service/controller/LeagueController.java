package org.fpl.service.controller;

import java.util.List;
import java.util.Optional;

import org.fpl.service.dao.TeamDao;
import org.fpl.service.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LeagueController {
	@Autowired
	TeamDao teamDao;

	@RequestMapping("/")
	public ModelAndView firstPage() {
		return new ModelAndView("home");
	}

	@DeleteMapping("/team/{teamsId}")
	public String deleteLeagueResult(@PathVariable int teamsId) {
		Team footballTeam = teamDao.getOne(teamsId);
		teamDao.delete(footballTeam);
		return "deleted";
	}

	@PostMapping(path = "/team", consumes = { "application/json" })
	public Team addLeagueResult(@RequestBody Team team) {
		teamDao.save(team);
		return team;
	}

	@GetMapping(path = "/teams", produces = { "application/JSON" })
	public List<Team> getAllLeaguesResult() {
		return teamDao.findAll();

	}

	@PutMapping(path = "/team", consumes = { "application/json" })
	public Team saveOrUpdateLeagueResult(@RequestBody Team team) {
		teamDao.save(team);
		return team;
	}

	@RequestMapping(path = "/team/{teamsId}", produces = { "application/JSON" })
	public Optional<Team> getLeagueResult(@PathVariable("teamsId") int teamsId) {
		return teamDao.findById(teamsId);

	}
}
