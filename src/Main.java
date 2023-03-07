public class Main {
    public static void main(String[] args) {


        Person irina = new Person("Ирина", 56);
        Person igor = new Person("Игорь", 60);
        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 27);
        Person jane = new Person("Женя", 10);
        Person ivan = new Person("Ваня", 8);
        Person Sasha = new Person("Саша", 9);
        Person Sasha10 = new Person("Саша", 10);
        Person Sasha11 = new Person("Саша", 11);
        Person Sasha12 = new Person("Саша", 12);
        Person Sasha3 = new Person("Саша", 3);

        GeoTree gt = new GeoTree();

        gt.appendParentChild(irina, vasya); // Ирина родитель Васи
        gt.appendParentChild(irina, masha); // Ирина родитель Маши
        gt.appendParentChild(vasya, jane); // Вася родитель Жени
        gt.appendParentChild(vasya, ivan); // Вася родитель Ивана
        gt.appendWifeHusband(irina, igor); // Ирина жена Игоря
        gt.appendParentChild(igor, vasya); // Игорь родитель Васи
        gt.appendParentChild(igor, masha); // Игорь родитель Маши
        gt.appendParentChild(igor, Sasha); // Игорь родитель Саши
        gt.appendParentChild(igor, Sasha10); // Игорь родитель Саши
        gt.appendParentChild(igor, Sasha11); // Игорь родитель Саши
        gt.appendParentChild(igor, Sasha3); // Игорь родитель Саши

        // Ищем детей Ирины
        System.out.println("Дети Ирины");
        System.out.println(gt.spend(irina, Relationship.PARENT));
        // Ищем детей Игоря
        System.out.println("Дети Игоря");
        System.out.println(gt.spend(igor, Relationship.PARENT));

        // Ищем мужа Ирины (Чья жена Ирина?)
        System.out.println("Муж Ирины");
        System.out.println(gt.spend(irina, Relationship.WIFE));

        // Ищем людей определенного возраста
        System.out.println(gt.searchAge());
    }
}