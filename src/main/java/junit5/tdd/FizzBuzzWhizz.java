package junit5.tdd;

public class FizzBuzzWhizz {
    public String playFizzBuzzWhizz(int number){
        if(number % 3 == 0){
            return "fizz";
        }
        return String.valueOf(number);
    }

}
