package citi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//包含扫描的入口，所以要在包的根目录下
public class StationerySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StationerySystemApplication.class, args);
	}
}
