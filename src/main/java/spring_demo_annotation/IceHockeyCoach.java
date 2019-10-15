package spring_demo_annotation;


import org.springframework.stereotype.Component;

@Component
public class IceHockeyCoach implements Coach {

    private FortuneService fortuneService;

    public IceHockeyCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public String getDailyWorkout() {
        return "put on your helmet";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
