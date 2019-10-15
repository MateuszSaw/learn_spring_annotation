package spring_demo_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("spring_demo_annotation")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    //define bean for sad fortune
    @Bean
    public FortuneService sadFortuneService(){
        return  new SadFortuneService();
    }

    //define bean for our swim coach And inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

    @Bean
    public FortuneService hardFortuneService(){
        return new HardFortuneService();
    }

    @Bean
    public Coach iceHockeyCoach(){
        IceHockeyCoach myIceHockeyCoach = new IceHockeyCoach(hardFortuneService());
        return myIceHockeyCoach;
    }
}
