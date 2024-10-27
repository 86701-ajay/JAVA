package com.sunbeam;

import java.io.Serializable;
import java.util.Objects;

public class Project implements Serializable {
	
	int i;
	String title;
	int teamSize;
	double projectCost;
	String technology;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int i, String title, int teamSize, double projectCost, String technology) {
		super();
		this.i = i;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.technology = technology;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(i);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return i == other.i;
	}

	@Override
	public String toString() {
		return "Project [i=" + i + ", title=" + title + ", teamSize=" + teamSize + ", projectCost=" + projectCost
				+ ", technology=" + technology + "]";
	}

	public Project(int i) {
		this.i = i;
	}
	
	

}
