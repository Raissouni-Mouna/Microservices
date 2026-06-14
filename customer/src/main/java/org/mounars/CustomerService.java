package org.mounars;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRequest customerRequest) {
        Customer customer = Customer.builder()
                .fisrtName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .build();
        //TODO  : check if email is valid
        //TODO  : check if email is not taken
        // TODO : check if fraudster
        customerRepository.save(customer);
        // TODO : send notification

    }
}
