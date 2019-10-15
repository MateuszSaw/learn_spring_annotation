package spring_demo_annotation;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {


    private String fileName = "C:\\Users\\User\\IdeaProjects\\Spring\\spring_demo_02_annotation\\src\\main\\resources\\lista";
    private List<String> theFortunes;
    private Random random = new Random();


    public FileFortuneService() {
        System.out.println("constructor inside FileFortuneService");
    }

    @PostConstruct
    private void loadFortunesFile() {
        System.out.println("inside loadFortunesfile method with @PostConstruct annotation");
        File file = new File(fileName);
        theFortunes = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = br.readLine()) != null) {
                theFortunes.add(line);
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

    public String getFortune() {
        int index = random.nextInt(theFortunes.size());
        String fileFortune = theFortunes.get(index);
        return fileFortune;
    }

}