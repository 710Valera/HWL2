package GBLesson1;

public class SumArray {

    public static void sumArray(String[][] arr) {

        int sum =0;

        if (arr.length != 4) {
            throw new MyArraySizeException(); }
        for (int i =0 ; i <arr.length ; i++){
            if (arr[i].length !=4){
                throw new MyArraySizeException();
            }
        }

        for (int i = 0; i <arr.length; i++ ) {
            for (int j = 0; j <arr.length; j++) {
                try {
                sum = sum + Integer.parseInt(arr[i][j]);}
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }

        }

        System.out.println("Сумма всех элементов массива = " + sum);
            }

        }

