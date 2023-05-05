public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();


        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = 0;
    /*На следующем этапе компиляция остановится, т.к. при условии переменной b мы полуаем 0.
    При делении на 0 мы получаем ошибку "by zero", которая сообщает нам о том, что деление на 0
    не возможно.
    Для решения этой проблемы:
     1) Можно создать Exeption и прогнать код через блок try;
     2) Заключить в блок while и так же прописать условия выполнения, общаясь с пользователем
     через консоль;
     3) Изменить тип данных на double;
     */

        //Заключаем наше решение в блок try, чтобы поймать ошибку и дать решение
        try {
            c = calc.devide.apply(a, b);
            //Ловим ошибку
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 невозможно! Пробую привести к вещественному числу");
        } finally {
            System.out.println("Необходимо изменить значения данных, или тип данных");
        }
        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
    }
}