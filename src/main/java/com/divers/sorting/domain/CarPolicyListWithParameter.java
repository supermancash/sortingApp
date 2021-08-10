package com.divers.sorting.domain;

import java.util.List;

public class CarPolicyListWithParameter {

    private String parameter;
    private List<CarPolicy> carPolicyList;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public List<CarPolicy> getCarPolicyList() {
        return carPolicyList;
    }

    public void setCarPolicyList(List<CarPolicy> carPolicyList) {
        this.carPolicyList = carPolicyList;
    }

}
