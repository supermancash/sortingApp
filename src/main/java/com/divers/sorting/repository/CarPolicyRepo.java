package com.divers.sorting.repository;

import com.divers.sorting.domain.CarPolicy;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CarPolicyRepo {

    private final Map<String, List<CarPolicy>> carPolicies;

    public CarPolicyRepo() {
        carPolicies = new HashMap<>();

        carPolicies.put("EQS", Arrays.asList(
                new CarPolicy("code11", "name11"),
                new CarPolicy("code12", "name12"),
                new CarPolicy("code13", "name13"),
                new CarPolicy("code14", "name14")));

        carPolicies.put("C123", Arrays.asList(
                new CarPolicy("code21", "name21"),
                new CarPolicy("code22", "name22"),
                new CarPolicy("code23", "name23"),
                new CarPolicy("code24", "name24")));

        carPolicies.put("A123", Arrays.asList(
                new CarPolicy("code31", "name31"),
                new CarPolicy("code32", "name32"),
                new CarPolicy("code33", "name33"),
                new CarPolicy("code34", "name34")));

        carPolicies.put("G", Arrays.asList(
                new CarPolicy("code41", "name41"),
                new CarPolicy("code42", "name42"),
                new CarPolicy("code43", "name43"),
                new CarPolicy("code44", "name44")));
    }

    public List<CarPolicy> getCarPolicyListByParam(String queryParameter) {
        return carPolicies.get(queryParameter);
    }

    public boolean updateCarPolicyList(String queryParameter, List<CarPolicy> carPolicies) {
        this.carPolicies.put(queryParameter, carPolicies);
        return true;
    }
}
