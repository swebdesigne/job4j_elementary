package ru.job4j.condition;

public class SwitchWeek {
    public String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятницу";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }

    public static class Liken {
        public static void main(String[] args){
            int first = 10;
            int second = 9;

            boolean result = first > second;
            System.out.println(result);

            result = first < second;
            System.out.println(result);

            result = first == second;
            System.out.println(result);
        }
    }
}
