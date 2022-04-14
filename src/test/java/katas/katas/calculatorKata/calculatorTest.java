package katas.katas.calculatorKata;

import katas.katas.caluclatorKata.Calculator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class calculatorTest {
    private double total;

    @Test
    void calculatorStartsWithTotalEqualZero(){
        Calculator calculator = new Calculator();

        assertThat(calculator.getTotal(), equalTo(0.0));
    }

    @Test
    void calculatorCanSumAValueToTotal(){
        Calculator calculator = new Calculator();
        double value1 = 3.3;
        calculator.sum(value1);
        assertThat(calculator.getTotal(), equalTo(3.3));
    }

    @Test
    void calculatorCanSubtractAValueToTotal(){
        Calculator calculator = new Calculator();
        double value1 = 3.3;
        calculator.subtract(value1);
        assertThat(calculator.getTotal(), equalTo(-3.3));
    }

    @Test
    void calculatorCanMultiplyAValueToTotal(){
        Calculator calculator = new Calculator();
        double value1 = 3;
        calculator.setTotal(3);
        calculator.multiply(value1);
        assertThat(calculator.getTotal(), equalTo((double)9));
    }

    @Test
    void calculatorCanDivideAValueToTotal(){
        Calculator calculator = new Calculator();
        double value1 = 3;
        calculator.setTotal(3);
        calculator.divide(value1);
        assertThat(calculator.getTotal(), equalTo((double)1));
    }

    @Test
    void calculatorCanMakeAPercentageFromTotal(){
        Calculator calculator = new Calculator();
        double value1 = 4;
        calculator.setTotal(100);
        calculator.percentageOf(value1);
        assertThat(calculator.getTotal(), equalTo((double)4));
    }

    @Test
    void calculatorCanKnowIfAValueIsEven(){
        Calculator calculator = new Calculator();
        assertThat(calculator.isEven(4), equalTo(true));
        assertThat(calculator.isEven(5), equalTo(false));
    }

    @Test
    void calculatorCanReturnTheGreaterValue(){
        Calculator calculator = new Calculator();
        double value1 = 2;
        double value2 = 4;
        assertThat(calculator.isGreater(value1, value2), equalTo(value2));
    }
    @Test
    void calculatorCanAddTheSumOfAllArrayItemsToTotal(){
        Calculator calculator = new Calculator();
        int[] array = {1,2,3,4};
        calculator.setTotal(10);
        calculator.addSumOfAllArrayItemsToTotal(array);

        assertThat(calculator.getTotal(), equalTo((double)20));
    }

    @Test
    void calculatorCanReturnArrayListWithAllNumbersEqualOrGreaterThanFiveOfAGivenArrayList(){
        Calculator calculator = new Calculator();
        ArrayList list1 = new ArrayList<Integer>();
        list1.add(3);
        list1.add(6);
        list1.add(5);
        list1.add(5);

        ArrayList list2 = new ArrayList<Integer>();
        list2.add(6);
        list2.add(5);
        list2.add(5);

        assertThat(calculator.returnArrayListWithAllNumbersEqualOrGreaterThanFiveOfAGivenArrayList(list1), equalTo(list2));
    }

    @Test
    void calculatorCanReturnListWithAllNumbersEqualOrGreaterThanFiveOfAGivenList(){
        Calculator calculator = new Calculator();
        List list1 = new ArrayList<>();
        list1.add(3);
        list1.add(6);
        list1.add(5);
        list1.add(5);
        list1.add(8);
        list1.add(3);
        list1.add(2);

        List list2 = new ArrayList<>();
        list2.add(6);
        list2.add(5);
        list2.add(5);
        list2.add(8);

        assertThat(calculator.returnListWithAllNumbersEqualOrGreaterThanFiveOfAGivenList(list1), equalTo(list2));
    }
}
