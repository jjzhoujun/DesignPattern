package site.ifish.designpattern;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Slf4j
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringCalApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringCalApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Start to run simple factory demo calculator");

    }
}
