package in.priya.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.priya.Entity.BookDetails;
import in.priya.projection.BookProjection;
import jakarta.transaction.Transactional;

public interface BookRepository extends JpaRepository<BookDetails, Integer> {
	
	
	@Modifying
	@Transactional
	@Query(value="insert into Book_Details(bname,bauthor)"+" values(:bName,:bAuthor)", nativeQuery=true)
	public void saveData(String bName, String bAuthor);
	
	@Query(value="select bname, bauthor from book_details", nativeQuery = true)
	public List<BookProjection> findBookNameAndAuthor();


}
