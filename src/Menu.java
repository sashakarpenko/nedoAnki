import java.util.*;

public class Menu {
    static int sc1;

    public void menuList() throws Exception {
        System.out.println("Выберете действие");
        System.out.println("1. Словарь");
        System.out.println("0. Выйти из програмы");
        Sc();
        if (sc1 == 0) {
            System.exit(0);
        }//выключение программы
        if (sc1 == 1) {
            menuDict();
        }
    }

    public void menuDict() throws Exception {
        Menu m = new Menu();
        System.out.println("Выберете действие");
        System.out.println("1. Создать колоду");
        System.out.println("2. Добавить слова в колоду");
        System.out.println("3. Вывод колоды");
        System.out.println("0. Выйти в главное меню");
        Sc();
        Decks d = new Decks();
        if (sc1 == 1) {
            d.fileName();
        }
        if (sc1 == 2) {
            d.addWord();
        }
        if (sc1 == 0) {
            menuList();
        }
    }

    public void Sc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваш выбор: ");
        sc1 = sc.nextInt();
        return;
    }//INPUT v menu
}