package in.priya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.priya.service.BookDetailsService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
		BookDetailsService book=context.getBean(BookDetailsService.class);
		
	    // book.saveBook();
		//book.getNameAndAuthor();
		//book.sortData("bAuthor");
		//book.paginationDemo(2);
		book.qbeDemo();
		
		
	}

}
