package POJOLibraries;

public class projectLibrary {

	////pojo class for project controller
	//we have to create for employee controller seperately
	
	//declare all variables as global
	String createdBy;
	String projectName;
	String status;
	int teamsize;
	public projectLibrary(String createdBy, String projectName, String status, int teamsize) {
		
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamsize = teamsize;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the teamsize
	 */
	public int getTeamsize() {
		return teamsize;
	}
	/**
	 * @param teamsize the teamsize to set
	 */
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	
	
	//provide constructors
	
	
	//provide getters and setters
	
	
}
