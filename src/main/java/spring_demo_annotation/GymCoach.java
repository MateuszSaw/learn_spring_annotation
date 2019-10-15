package spring_demo_annotation;

import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {
    public String getDailyFortune() {
        return null;
    }

    public String getDailyWorkout() {
        return "Strength today, Let's barbell bench press !";
    }
}
