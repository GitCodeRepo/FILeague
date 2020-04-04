package org.fpl.service.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	private int teamsId;
	private String teamsName;
	private int leagueId;
	private String leagueName;
	private int countryId;
	private String countryName;
	private int leaguePosition;

	public int getTeamsId() {
		return teamsId;
	}

	public Team(int teamsId, String teamsName, int leagueId, String leagueName, int countryId, String countryName,
			int leaguePosition) {
		super();
		this.teamsId = teamsId;
		this.teamsName = teamsName;
		this.leagueId = leagueId;
		this.leagueName = leagueName;
		this.countryId = countryId;
		this.countryName = countryName;
		this.leaguePosition = leaguePosition;
	}

	public void setTeamsId(int teamsId) {
		this.teamsId = teamsId;
	}

	public String getTeamsName() {
		return teamsName;
	}

	public void setTeamsName(String teamsName) {
		this.teamsName = teamsName;
	}

	public int getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getLeaguePosition() {
		return leaguePosition;
	}

	public void setLeaguePosition(int leaguePosition) {
		this.leaguePosition = leaguePosition;
	}

	@Override
	public String toString() {
		return "Team [teamsId=" + teamsId + ", teamsName=" + teamsName + ", leagueId=" + leagueId + ", leagueName="
				+ leagueName + ", countryId=" + countryId + ", countryName=" + countryName + ", leaguePosition="
				+ leaguePosition + "]";
	}

}
