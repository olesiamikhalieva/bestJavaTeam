package hw4_26_01_18.task12;

public class MainComplex {
    public static void main(String[] args) {

        ComplexNumbers complexNumbers = new ComplexNumbers(2, 2);
        ComplexNumbers complexNumbers1 = new ComplexNumbers(2, 2);

        operationWithComplexNumbers('/', complexNumbers, complexNumbers1);

    }

    public static void operationWithComplexNumbers(char operation, ComplexNumbers complexNumbers1, ComplexNumbers complexNumbers2) {
        ComplexNumbers result = new ComplexNumbers();

        switch (operation) {
            case '+':
                result.setRealD(complexNumbers1.getRealD() + complexNumbers2.getRealD());
                result.setImagineD(complexNumbers1.getImagineD() + complexNumbers2.getImagineD());
                break;
            case '-':
                result.setRealD(complexNumbers1.getRealD() - complexNumbers2.getRealD());
                result.setImagineD(complexNumbers1.getImagineD() - complexNumbers2.getImagineD());
                break;
            case '*':
                result.setRealD(complexNumbers1.getRealD() * complexNumbers2.getRealD() -
                        complexNumbers1.getImagineD() * complexNumbers2.getImagineD());

                result.setImagineD(complexNumbers1.getRealD() * complexNumbers2.getImagineD() +
                        complexNumbers1.getImagineD() * complexNumbers2.getRealD());
                break;
            case '/':
                //Действительная часть
                result.setRealD((complexNumbers1.getRealD() * complexNumbers2.getRealD() +
                        complexNumbers1.getImagineD() * complexNumbers2.getImagineD()) /
                        (complexNumbers2.getRealD() * complexNumbers2.getRealD()) +
                        (complexNumbers2.getImagineD() * complexNumbers2.getImagineD()));
                //Мнимая часть
                result.setImagineD((complexNumbers2.getRealD() * complexNumbers1.getImagineD() -
                        complexNumbers2.getImagineD() * complexNumbers1.getRealD()) /
                        (complexNumbers2.getRealD() * complexNumbers2.getRealD()) +
                        (complexNumbers2.getImagineD() * complexNumbers2.getImagineD()));
                break;
        }
        System.out.println(result.getRealD() + " + i" + result.getImagineD());
    }

}
