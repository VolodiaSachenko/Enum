import java.util.Arrays;

/**
 * @author Volodia Sachenko & Alishev
 * @version 0.1
 * @since 28.11.21
 */

public class Test {

    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        Animal dog = Animal.valueOf("DOG");
        Animal dog2 = Animal.DOG;
        Animal frog = Animal.FROG;
        Season season = Season.SUMMER;
        Season season1 = Season.WINTER;
        Season season2 = Season.AUTUMN;
        Season[] seasons = Season.values();

        // Эти строки я закомментил, так как это было закомменчено в Алишева, они скорее всего, были чисто ради примера,
        // а так switch здесь особо нечего переключать, результат всегда один, аналогично с instanceof

//        switch (animal) {
//            case CAT -> System.out.println("Це кіт");
//            case DOG -> System.out.println("Це собака");
//            case FROG -> System.out.println("А це жаба");
//
//        }
//
//        switch (season) {
//            case SUMMER -> System.out.println("It's warm outside");
//            case WINTER -> System.out.println("It's cold outside");
//            case SPRING -> System.out.println("Весна на дворі!");
//            case AUTUMN -> System.out.println("Осінь - золота пора");
//        }
//
//        System.out.println(season instanceof Season);
//        System.out.println(season instanceof Enum);
//        System.out.println(season instanceof Object);

        System.out.println("Об'єкт dog2: " + dog2);
        System.out.println("Об'єкт frog, з незаповненим конструктором: " + frog);
        System.out.println("season.getClass(): " + season.getClass());
        System.out.println("animal.getTranslation(): " + animal.getTranslation());
        System.out.println("Переклад на українську, метод toString(): " + animal);
        System.out.println("Середня температура зимою: " + season1.getTEMPERATURE());
        System.out.println("season2.name(): " + season2.name());
        System.out.println("animal.name(): " + animal.name());
        System.out.println("Переклад на українську, метод dog.getTranslation(): " + dog.getTranslation());
        System.out.println("Індекс, метод season1.ordinal(): " + season1.ordinal());
        System.out.println("Метод Season.values(): " + Arrays.toString(seasons));
    }
}
