package com.carloncho.code.number;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/number")
public class NumberController {

	//Logger logger = LoggerFactory.getLogger(NumberController.class);
	
	@Autowired
    private NumberService numberService;
 
    @GetMapping(path = "/square/{number}")
    public String getSquare(@PathVariable Long number) {
    	System.out.println("Llamando al servicio para sacar el cuadrado" + number);
        return String.format("{\"square\": %s}", numberService.square(number));
    }
}
