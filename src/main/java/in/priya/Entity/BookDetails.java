package in.priya.Entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="Book_Details")
public class BookDetails {
	
	
	 @Id
     @Column(name="bid")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bId;
	@Column(name="bname")
	private String bName;
	@Column(name="bauthor")
	private String bAuthor;
	
	@CreationTimestamp
	@Column(name="created_date", updatable = false)
	private LocalDate createdDate;

	@UpdateTimestamp
	@Column(name = "updated_date", insertable = false)
	private LocalDate updatedDate;
	
	/*@PrePersist
	public void onCreate()
	{
		createdDate=LocalDate.now();
	}
	
	@PreUpdate
	public void onUpdate()
	{
		updatedDate=LocalDate.now();
	}*/
	
	
	public BookDetails() {
		super();
	}
           
	
	public BookDetails(String bName, String bAuthor) {
		super();
	
		this.bName = bName;
		this.bAuthor = bAuthor;
	
	}
	  
	
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
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
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}


	@Override
	public String toString() {
		return "BookDetails [bId=" + bId + ", bName=" + bName + ", bAuthor=" + bAuthor + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
	
	
	

}
