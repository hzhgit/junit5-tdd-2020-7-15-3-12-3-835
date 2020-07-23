package junit5.tdd;

public class FizzBuzzWhizz {
    public String playFizzBuzzWhizz(int number){
        if(number % 3 == 0){
            return "fizz";
        }
        if(number % 5 == 0){
            return "buzz";
        }
        return String.valueOf(number);
    }

}
