package example.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("/")
    public String getHomepage() {
        return "index"; // This should match the name of your HTML file without the .html extension
    }
}
    

    
}
