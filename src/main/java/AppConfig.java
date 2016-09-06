import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableAutoConfiguration
@RestController
public class AppConfig {
	
	
	@RequestMapping("/")
	public String theWelcomeMessage(){
		return "Hello World";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(AppConfig.class,args);

	}

}
