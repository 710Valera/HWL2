package GBLesson1;

public class MyArrayDataException extends RuntimeException{

    public MyArrayDataException(int i, int j){
        System.out.println( "Элемент c индексом" + i + j + "Нельзя преобразовать в число");
    }

}
