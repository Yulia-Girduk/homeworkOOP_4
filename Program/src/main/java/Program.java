public class Program {

    public static void main(String[] args) {
        Apple apple = new Apple(5);
        Box<Apple> applesBox = new Box<>();
        Orange orange = new Orange(10);
        Box<Orange> orangesBox = new Box<>();

        Box<Apple> appleBoxTwo = new Box<>();



        applesBox.add(apple);
        applesBox.add(apple);
        applesBox.add(apple);
        System.out.println("Вес коробки с яблоками " + applesBox.getWeight());

        orangesBox.add(orange);
        orangesBox.add(orange);
        System.out.println("Вес коробки с апельсинами " + orangesBox.getWeight());

        System.out.println("Коробки с апельсинами и яблоками " + applesBox.compare(orangesBox));

        applesBox.transferFruits(appleBoxTwo);
        System.out.println("Вес коробки из которой пересыпали яблоки " + applesBox.getWeight());
        System.out.println("Вес коробки в которую пересыпали яблоки " + appleBoxTwo.getWeight());


      //  System.out.println(apples.compare(oranges));
      //  System.out.println(oranges.compare(oranges));
      //  System.out.println(orangeBox.getWeight());
     //   oranges.transferFruits(orangeBox);
     //   System.out.println(oranges.getWeight());
     //   System.out.println(orangeBox.getWeight());
    }
}
