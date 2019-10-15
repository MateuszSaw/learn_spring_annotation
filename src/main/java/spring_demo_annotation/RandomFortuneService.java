package spring_demo_annotation;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "No pain no gain!",
            "Impossible is nothing!",
            "Just Do it!"
    };

    private Random random = new Random();

    public String getFortune() {

        int index = random.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}
