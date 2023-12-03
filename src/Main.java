
public class Main {
    public static void main(String[] args){
        System.out.println("\nУпражнение 11. Напишите программу для перевода  температуры по Цельсию в температуру " +
                "\nпо Кeльвину и Фаренгейту. Для этого добавьте интерфейс Convertable, у которого есть метод " +
                "\nсonvert для конвертации из одной  системы измерения в другую");
        Celsius c1 = new Celsius();
        Fahrenheit f1=new Fahrenheit();
        Kelvin k1=new Kelvin();
        c1.a=Math.random()*100;
        System.out.println(c1);
        f1.setA(c1.convert('F'));//из цельсия в фаренгейты
        System.out.println(f1);
        k1.setA(c1.convert('K'));
        System.out.println(k1);//из цельсия в кельвины
        k1.setA(f1.convert('K'));//из фаренгейт в кельвины
        System.out.println(k1);
    }
}
