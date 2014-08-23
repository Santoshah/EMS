/**
 * 
 */
package com.barun.ems.domain;

import java.io.Serializable;

/**
 * @author Bibhuti
 *
 */
public class Competency implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String competency;
	private String description;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the competency
	 */
	public String getCompetency() {
		return competency;
	}
	/**
	 * @param competency the competency to set
	 */
	public void setCompetency(String competency) {
		this.competency = competency;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
