package annotation.inbuildclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class InbuildConfig {

    @Bean
    public List<String> l(){
         List<String> list = new ArrayList();
         list.add("1");
         list.add("2");
        return list;
    }

}
