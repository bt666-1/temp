package com.rkvk.automobile.automobileshop.controller;

import com.rkvk.automobile.automobileshop.dto.CustomerDTO;
import com.rkvk.automobile.automobileshop.entity.Customer;
import com.rkvk.automobile.automobileshop.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody CustomerDTO dto) {
        return customerService.addCustomer(dto);
    }

    @GetMapping
    public List<CustomerDTO> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerDTO getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO dto) {
        return customerService.updateCustomer(id, dto);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return "Customer with ID " + id + " deleted successfully.";
    }
}
