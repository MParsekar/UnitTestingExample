package mes.practical.UnitTestingExample.Service;

import org.springframework.stereotype.Service;

@Service
public class FirstSevice {
    /**
     * Function to add two number
     * 
     * @param number1 - Number 1
     * @param number2 - NUmber 2
     * @return sum of two Number 1 and Number 2
     */
    public int addTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }

}
