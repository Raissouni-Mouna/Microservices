package org.mounars;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // indique que la classe expose des endpoints rest
// toute les methode renvoies du json
@RequestMapping("api/customers") // définit url de bases du controller
public record CustomerController(CustomerService customerService) {

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRequest  customerRequest) {
        // @RequestBody convertit automatiquement le json en objet java
        log.info("Registering customer: {}", customerRequest);
        customerService.registerCustomer(customerRequest);
    }


}
