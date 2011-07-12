package com.candela.ftvtomcat.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "match")
public class Match {

	private String local;
	private String visitor;

	public Match() {
	}

	public Match(String local, String visitor) {
		this.local = local;
		this.visitor = visitor;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getVisitor() {
		return visitor;
	}

	public void setVisitor(String visitor) {
		this.visitor = visitor;
	}

}
