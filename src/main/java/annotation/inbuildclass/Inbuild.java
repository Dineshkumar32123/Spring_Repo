package annotation.inbuildclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Inbuild {


    @Autowired
    List<String> l;
}
