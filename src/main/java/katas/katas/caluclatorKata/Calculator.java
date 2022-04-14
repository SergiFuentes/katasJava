package katas.katas.caluclatorKata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculator {
    private double total;

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void sum(double value1) {
        total += value1;
    }

    public void subtract(double value1) {
        total -= value1;
    }

    public void multiply(double value1) {
        total *= value1;
    }


    public void divide(double value1) {
        total /= value1;
    }

    public void percentageOf(double value1) {
        total = total * value1 / 100;
    }

    public boolean isEven(double value1) {
        if (value1 % 2 == 0) return true;
        return false;
    }

    public double isGreater(double value1, double value2) {
        return value1 > value2 ? value1 : value2;
    }

    public void addSumOfAllArrayItemsToTotal(int[] array) {
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

    }

    public ArrayList returnArrayListWithAllNumbersEqualOrGreaterThanFiveOfAGivenArrayList(ArrayList<Integer> list1) {


        ArrayList<Integer> newList = new ArrayList<>();
            for(int i = 0; i < list1.size(); i++){
                if(list1.get(i) >= 5){
                    newList.add(list1.get(i));
                }
            }
            return newList;
        }

    public List returnListWithAllNumbersEqualOrGreaterThanFiveOfAGivenList(List<Integer> list1) {

        //SI LOS TIPOS FUERAN LIST Y NO ARRAYLIST
        Stream<Integer> newList = list1.stream().filter(s->s>= 5);
        List list2;
        list2 = newList.collect(Collectors.toList());
        return list2;


    }

}