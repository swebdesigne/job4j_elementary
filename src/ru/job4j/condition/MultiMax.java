package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third){
        int result = first;
        if(result < second){
            result = second;
            if(result < third){
                result = third;
            }
        }else{
            if(result < third){
                result = third;
            }
        }
        return result;
    }
    public static int newMax(int first, int second, int third){
        int result = first > second ? first : second;
        return result > third ? result : third;
    }
    public static void main(String[] args){
        int rsl = max(4,4,4);
        System.out.println(rsl);
        rsl = newMax(4,7,4);
        System.out.println(rsl);
    }
}
