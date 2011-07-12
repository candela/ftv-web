package com.candela.ftvtomcat.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="matches")
public class MatchList {
	
	private int count;
	private List<Match> matches;
	
	public MatchList() {}
	
	public MatchList(List<Match> matches) {
		this.matches = matches;
		this.count = matches.size();
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@XmlElement(name="match")
	public List<Match> getMatches() {
		return matches;
	}
	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}
	
}
