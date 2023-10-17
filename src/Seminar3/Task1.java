package Seminar3;
                    /*
                    Создайте набор тестов, полностью покрывающих все ветви кода функции fizzBuzz.
                     Эта функция принимает на вход число и возвращает "Fizz", если число делится на 3, "Buzz", если число делится на 5,
                     и "FizzBuzz", если число делится на 15. Если число не делится ни на 3, ни на 5, ни на 15,
                      функция возвращает входное число в виде строки.
                     */
public class Task1 {
    public static String fizzBuzz(int number){
        if (number % 15 == 0){
            return "FizzBuzz";
        } else if (number % 3 == 0){
                return "Fizz";
        } else if (number % 5 == 0){
            return "Buzz";
        }
        String string = "";
        return number + string;
    }
}
