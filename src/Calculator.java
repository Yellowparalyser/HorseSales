import model.Horse;

import java.util.ArrayList;

public class Calculator {

    public static double calculateSum(ArrayList<Horse> horses){

        double sum =0;

        for(int i = 0; i <= horses.size()-1; i++){
            sum = sum + horses.get(i).getPrice();
        }

        return sum;
    }

    public static double calculateAverage(ArrayList<Horse> horses){

        double average = calculateSum(horses)/horses.size();

        return average;
    }

}
