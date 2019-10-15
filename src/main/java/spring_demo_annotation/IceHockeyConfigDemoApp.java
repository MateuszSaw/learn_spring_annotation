package spring_demo_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class IceHockeyConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach theCoach = context.getBean("iceHockeyCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
