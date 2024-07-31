package egor.pantushov.robot_clerk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RobotClerkApplication {

	public static void main(String[] args) {
		var context=SpringApplication.run(RobotClerkApplication.class, args);
		RobotClerk robotClerk=context.getBean(RobotClerk.class);
	robotClerk.doWork();
	}

}
