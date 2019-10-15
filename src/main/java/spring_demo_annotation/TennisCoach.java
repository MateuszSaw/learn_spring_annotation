package spring_demo_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    public TennisCoach( ) {
        System.out.println("TennisCoach: im inside default constructor");
    }

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }


    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //define my init method
    @PostConstruct
    public void doMyStartupStuff (){
        System.out.println("Tennis Coach: inside of doMyStartUpStuff()");
    }

    //define my destroy method
    @PreDestroy
public void doMyCleanupStuff(){
    System.out.println("Tennis Coach: inside of doMyClenUpStuff()");

}
}
