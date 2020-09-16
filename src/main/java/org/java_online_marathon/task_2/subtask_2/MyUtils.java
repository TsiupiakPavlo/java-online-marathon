package org.java_online_marathon.task_2.subtask_2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyUtils {
    public Map<String, Double> averageRating(List<Caffee> coffees) {
        Map<String, Double> avgRating = new HashMap<>();

        if (coffees.isEmpty()) {
            return avgRating;
        }

        double sumCaffeeRating = 0, sumEspressoRating = 0, sumCappuccinoRating = 0;
        int countCaffee = 0, countEspresso = 0, countCappuccino = 0;

        for (int i = 0; i < coffees.size(); i++) {
            if (coffees.get(i).getName().equals("Caffee")) {
                sumCaffeeRating += coffees.get(i).getRating();
                countCaffee++;
            }
            if (coffees.get(i).getName().equals("Espresso")) {
                sumEspressoRating += coffees.get(i).getRating();
                countEspresso++;
            }
            if (coffees.get(i).getName().equals("Cappuccino")) {
                sumCappuccinoRating += coffees.get(i).getRating();
                countCappuccino++;
            }
        }

        if (countCaffee > 0) {
            avgRating.put("Caffee", sumCaffeeRating / countCaffee);
        }
        if (countEspresso > 0) {
            avgRating.put("Espresso", sumEspressoRating / countEspresso);
        }
        if (countCappuccino > 0) {
            avgRating.put("Cappuccino", sumCappuccinoRating / countCappuccino);
        }

        return avgRating;
    }
}
