package junit5.tdd;

import com.google.common.base.Strings;

public class FizzBuzzWhizz {
    public String playFizzBuzzWhizz(int number){
        String result = "";
        if(number % 3 == 0){
            result += "fizz";
        }
        if(number % 5 == 0){
            result += "buzz";
        }
        if(number % +7 == 0){
            result += "whizz";
        }
        if(result.equals(""))
            return String.valueOf(number);
        return result;
    }

}
