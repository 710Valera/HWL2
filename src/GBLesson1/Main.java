package GBLesson1;

public class Main {

    public static void main(String[] args) {
        String[][] test ={
                {"1", "1", "1", "1"},
        {"1", "1", "1", "1"},
        {"1", "1", "1", "1"},
        {"1", "1", "1", "1"},};
try {
    SumArray.sumArray(test);
}
catch (MyArraySizeException e){
    System.out.println("Ошибка в размере массива");
}
catch (MyArrayDataException e){
    System.out.println("Не все данные могут быть преобразованны в число");
}

    }
}
