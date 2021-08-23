package com.divers.sorting.controllers;

import com.divers.sorting.domain.CarPolicy;
import com.divers.sorting.repository.CarPolicyRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    private final CarPolicyRepo carPolicyRepo;

    public MainController(CarPolicyRepo carPolicyRepo) {
        this.carPolicyRepo = carPolicyRepo;
    }

    @GetMapping(value = "get-car-policy") // no hyphens in REST endpoints
    @ResponseBody
    public List<CarPolicy> getCarPolicy(@RequestParam String parameter) {
        return carPolicyRepo.getCarPolicyListByParam(parameter);
    }

    @PostMapping(value = "set-car-policy") // no hyphens in REST endpoints
    public void setCarPolicy(@RequestParam String parameter, @RequestBody List<CarPolicy> carPolicies) {
        carPolicyRepo.updateCarPolicyList(parameter, carPolicies);
    }
}
