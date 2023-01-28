package mes.practical.UnitTestingExample.Service;

import org.springframework.stereotype.Service;

@Service 
//Annotation Denoting a service. 
//Service A place where code control in done. 
//Most of the business logic comes here.
public class FirstSevice {

    public int addTwoNumbers(int number1, int number2){
        return number1+number2;
    }
    
}
