package guru.springframework.sfgpetclinic;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgPetClinicApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(SfgPetClinicApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Source args: " + args.getSourceArgs().toString());
        System.out.println("Option Names: " + args.getOptionNames());
        System.out.println("Non Option Names: " + args.getNonOptionArgs());
        System.out.println("Change");
    }

}

