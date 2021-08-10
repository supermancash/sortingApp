package com.divers.sorting.controllers;

import com.divers.sorting.domain.CarPolicyListWithParameter;
import com.divers.sorting.repository.CarPolicyRepo;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    private CarPolicyRepo carPolicyRepo;

    public MainController(CarPolicyRepo carPolicyRepo) {
        this.carPolicyRepo = carPolicyRepo;
    }

    @GetMapping(value = "get-car-policy")
    @ResponseBody
    public CarPolicyListWithParameter getCarPolicy(@RequestParam(required = false) String parameter) {
        CarPolicyListWithParameter carPolicyListWithParameter = carPolicyRepo.getCarPolicyListByParam(parameter);
        return carPolicyListWithParameter;
    }

    @PostMapping(value = "set-car-policy")
    @ResponseBody
    public CarPolicyListWithParameter setCarPolicy(@RequestBody CarPolicyListWithParameter carPolicyListWithParameter) {
        carPolicyRepo.updateCarPolicyList(carPolicyListWithParameter);
        return carPolicyListWithParameter;
    }
}
