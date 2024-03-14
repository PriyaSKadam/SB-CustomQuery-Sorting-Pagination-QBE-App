package in.priya.dto;

import jakarta.persistence.Column;

public class BookDetailsDto {
	
	@Column(name="bname")
	private String bName;
	
	
	@Column(name="bauthor")
	private String bAuthor;

	
	

	public BookDetailsDto(String bName, String bAuthor) {
		super();
		this.bName = bName;
		this.bAuthor = bAuthor;
	}


	public String getbName() {
		return bName;
	}


	public void setbName(String bName) {
		this.bName = bName;
	}


	public String getbAuthor() {
		return bAuthor;
	}


	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}


	@Override
	public String toString() {
		return "BookDetailsDto [bName=" + bName + ", bAuthor=" + bAuthor + "]";
	}
	
	

}
