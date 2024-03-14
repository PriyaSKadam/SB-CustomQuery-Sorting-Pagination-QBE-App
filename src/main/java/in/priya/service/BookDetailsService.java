package in.priya.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.priya.Entity.BookDetails;
import in.priya.dto.BookDetailsDto;
import in.priya.projection.BookProjection;
import in.priya.repository.BookRepository;

@Service
public class BookDetailsService {
	
	private BookRepository bookRepo;


	public BookDetailsService(BookRepository bookRepo) {
		super();
		this.bookRepo = bookRepo;
	}

	public void saveBook()
	{
		BookDetails b=new BookDetails("Java","James Gosling");
		BookDetails b1=new BookDetails("Clean Code","Robert C. Martin");
		BookDetails b2=new BookDetails("Introduction to Algorithms","Thomas H. Cormen");
		BookDetails b3=new BookDetails("SICP","Harold Abelson");
		BookDetails b4=new BookDetails("The Clean Coder","Robert C. Martin");
		BookDetails b5=new BookDetails("Code Complete","Steve McConnell");
		BookDetails b6=new BookDetails("Design Patterns","Erich Gamma");
		BookDetails b7=new BookDetails("The Pragmatic Programmer","Andrew Hunt");

        List<BookDetails> list = Arrays.asList(b,b1,b2,b3,b4,b5,b6,b7);

               bookRepo.saveAll(list);
		
	}
	
	public void getNameAndAuthor()
	{
		List<BookProjection> nameAndAuthor = bookRepo.findBookNameAndAuthor();
		
		 List<BookDetailsDto> list=new ArrayList<>();
		 
		 
		 
		 for(BookProjection book : nameAndAuthor)
		 {
			 list.add(new BookDetailsDto(book.getbName(), book.getbAuthor()));
		 }
		 
		 list.forEach(i->System.out.println(i));
	}
	
	public void sortData(String columnName)
	{
		//List<BookDetails> all = bookRepo.findAll(Sort.by(columnName));
		List<BookDetails> all = bookRepo.findAll(Sort.by(columnName).descending());
		
		all.forEach(i->System.out.println(i));
	}
	
	public void paginationDemo(int pageNo)
	{
		PageRequest of = PageRequest.of(pageNo-1, 3);
		
		      Page<BookDetails> findAll = bookRepo.findAll(of);
		      
		       List<BookDetails> list=findAll.getContent();
	 
		        list.forEach(s->System.out.println(s));
	
	}
	
	public void qbeDemo()
	{
		BookDetails b=new BookDetails();
		b.setbName("java");
		Example<BookDetails> example= Example.of(b);
		
		List<BookDetails> list = bookRepo.findAll(example);
		
		list.forEach(s->System.out.println(s));
	}
}
