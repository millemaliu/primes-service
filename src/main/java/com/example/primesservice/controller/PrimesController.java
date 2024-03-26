package com.example.primesservice.controller;

import com.example.primesservice.service.PrimesService;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PrimesController {
    PrimesService primesService;

    public PrimesController(PrimesService primesService) {
        this.primesService = primesService;
    }

    @GetMapping("/primes/{n}")
    public boolean isPrime(@PathVariable int n) {
        return primesService.isPrime(n);
    }

}
