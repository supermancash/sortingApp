package com.divers.sorting.repository;

import com.divers.sorting.domain.CarPolicy;
import com.divers.sorting.domain.CarPolicyListWithParameter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarPolicyRepo {

    private CarPolicyListWithParameter carPolicyListWithParameter1;
    private CarPolicyListWithParameter carPolicyListWithParameter2;
    private CarPolicyListWithParameter carPolicyListWithParameter3;
    private CarPolicyListWithParameter carPolicyListWithParameter4;

    public CarPolicyListWithParameter getCarPolicyListByParam(String queryParameter) {
        if (queryParameter.equals("list1")) {
            if (carPolicyListWithParameter1 == null) {
                carPolicyListWithParameter1 = new CarPolicyListWithParameter();
                List<CarPolicy> carPolicyList = new ArrayList<>();

                CarPolicy carPolicy1 = new CarPolicy();
                carPolicy1.setCode("code11");
                carPolicy1.setName("name11");
                carPolicy1.setId("1");
                CarPolicy carPolicy2 = new CarPolicy();
                carPolicy2.setCode("code12");
                carPolicy2.setName("name12");
                carPolicy2.setId("2");
                CarPolicy carPolicy3 = new CarPolicy();
                carPolicy3.setCode("code13");
                carPolicy3.setName("name13");
                carPolicy3.setId("3");
                CarPolicy carPolicy4 = new CarPolicy();
                carPolicy4.setCode("code14");
                carPolicy4.setName("name14");
                carPolicy4.setId("4");
                CarPolicy carPolicy5 = new CarPolicy();
                carPolicy5.setCode("code15");
                carPolicy5.setName("name15");
                carPolicy5.setId("5");
                CarPolicy carPolicy6 = new CarPolicy();
                carPolicy6.setCode("code16");
                carPolicy6.setName("name16");
                carPolicy6.setId("6");
                CarPolicy carPolicy7 = new CarPolicy();
                carPolicy7.setCode("code17");
                carPolicy7.setName("name17");
                carPolicy7.setId("7");
                CarPolicy carPolicy8 = new CarPolicy();
                carPolicy8.setCode("code18");
                carPolicy8.setName("name18");
                carPolicy8.setId("8");

                carPolicyList.add(carPolicy1);
                carPolicyList.add(carPolicy2);
                carPolicyList.add(carPolicy3);
                carPolicyList.add(carPolicy4);
                carPolicyList.add(carPolicy5);
                carPolicyList.add(carPolicy6);
                carPolicyList.add(carPolicy7);
                carPolicyList.add(carPolicy8);

                carPolicyListWithParameter1.setCarPolicyList(carPolicyList);
                carPolicyListWithParameter1.setParameter("list1");

            }
            return carPolicyListWithParameter1;
        }
        if (queryParameter.equals("list2")) {
            if (carPolicyListWithParameter2 == null) {

                carPolicyListWithParameter2 = new CarPolicyListWithParameter();
                List<CarPolicy> carPolicyList = new ArrayList<>();

                CarPolicy carPolicy1 = new CarPolicy();
                carPolicy1.setCode("code21");
                carPolicy1.setName("name21");
                carPolicy1.setId("1");
                CarPolicy carPolicy2 = new CarPolicy();
                carPolicy2.setCode("code22");
                carPolicy2.setName("name22");
                carPolicy2.setId("2");
                CarPolicy carPolicy3 = new CarPolicy();
                carPolicy3.setCode("code23");
                carPolicy3.setName("name23");
                carPolicy3.setId("3");
                CarPolicy carPolicy4 = new CarPolicy();
                carPolicy4.setCode("code24");
                carPolicy4.setName("name24");
                carPolicy4.setId("4");
                CarPolicy carPolicy5 = new CarPolicy();
                carPolicy5.setCode("code25");
                carPolicy5.setName("name25");
                carPolicy5.setId("5");
                CarPolicy carPolicy6 = new CarPolicy();
                carPolicy6.setCode("code26");
                carPolicy6.setName("name26");
                carPolicy6.setId("6");

                carPolicyList.add(carPolicy1);
                carPolicyList.add(carPolicy2);
                carPolicyList.add(carPolicy3);
                carPolicyList.add(carPolicy4);
                carPolicyList.add(carPolicy5);
                carPolicyList.add(carPolicy6);

                carPolicyListWithParameter2.setCarPolicyList(carPolicyList);
                carPolicyListWithParameter2.setParameter("list2");
            }
            return carPolicyListWithParameter2;
        }
        if (queryParameter.equals("list3")) {
            if (carPolicyListWithParameter3 == null) {

                carPolicyListWithParameter3 = new CarPolicyListWithParameter();
                List<CarPolicy> carPolicyList = new ArrayList<>();

                CarPolicy carPolicy1 = new CarPolicy();
                carPolicy1.setCode("code31");
                carPolicy1.setName("name31");
                carPolicy1.setId("1");
                CarPolicy carPolicy2 = new CarPolicy();
                carPolicy2.setCode("code32");
                carPolicy2.setName("name32");
                carPolicy2.setId("2");
                CarPolicy carPolicy3 = new CarPolicy();
                carPolicy3.setCode("code33");
                carPolicy3.setName("name33");
                carPolicy3.setId("3");
                CarPolicy carPolicy4 = new CarPolicy();
                carPolicy4.setCode("code34");
                carPolicy4.setName("name34");
                carPolicy4.setId("4");
                carPolicyList.add(carPolicy1);
                carPolicyList.add(carPolicy2);
                carPolicyList.add(carPolicy3);
                carPolicyList.add(carPolicy4);

                carPolicyListWithParameter3.setCarPolicyList(carPolicyList);
                carPolicyListWithParameter3.setParameter("list3");
            }
            return carPolicyListWithParameter3;
        }
        if (queryParameter.equals("list4")) {
            if (carPolicyListWithParameter4 == null) {

                carPolicyListWithParameter4 = new CarPolicyListWithParameter();
                List<CarPolicy> carPolicyList = new ArrayList<>();

                CarPolicy carPolicy1 = new CarPolicy();
                carPolicy1.setCode("code41");
                carPolicy1.setName("name41");
                carPolicy1.setId("1");
                CarPolicy carPolicy2 = new CarPolicy();
                carPolicy2.setCode("code42");
                carPolicy2.setName("name42");
                carPolicy2.setId("2");
                CarPolicy carPolicy3 = new CarPolicy();
                carPolicy3.setCode("code43");
                carPolicy3.setName("name43");
                carPolicy3.setId("3");
                CarPolicy carPolicy4 = new CarPolicy();
                carPolicy4.setCode("code44");
                carPolicy4.setName("name44");
                carPolicy4.setId("4");

                carPolicyList.add(carPolicy1);
                carPolicyList.add(carPolicy2);
                carPolicyList.add(carPolicy3);
                carPolicyList.add(carPolicy4);

                carPolicyListWithParameter4.setCarPolicyList(carPolicyList);
                carPolicyListWithParameter4.setParameter("list4");
            }
            return carPolicyListWithParameter4;
        }
        return null;
    }

    public boolean updateCarPolicyList(CarPolicyListWithParameter carPolicyListWithParameter) {
        String parameter = carPolicyListWithParameter.getParameter();
        if (carPolicyListWithParameter != null) {
            switch (parameter) {
                case ("list1"):
                    carPolicyListWithParameter1 = carPolicyListWithParameter;
                    break;
                case ("list2"):
                    carPolicyListWithParameter2 = carPolicyListWithParameter;
                    break;
                case ("list3"):
                    carPolicyListWithParameter3 = carPolicyListWithParameter;
                    break;
                case ("list4"):
                    carPolicyListWithParameter4 = carPolicyListWithParameter;
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
