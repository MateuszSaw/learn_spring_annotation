package spring_demo_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {


    public String getFortune() {
        return "It's your lucky day";
    }
}
