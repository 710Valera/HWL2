package GBLesson1;

public class MyArraySizeException extends RuntimeException {

    public String getMessage(){
        return "Размер массива должен быть 4х4";
    }
}
