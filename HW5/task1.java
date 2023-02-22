import java.util.HashMap;

public class task1 {
    //    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    public static void main(String[] args) {
        HashMap <String, String> phoneBook = new HashMap<>();
        phoneBook.put("Боцман А.В.", "826-4586");
        phoneBook.put("Иванов П.И.", "659-7248, 8-989-84-94");
        phoneBook.put("Петров А.В.", "151-4981");
        phoneBook.put("Соколов И.В.", "168-4242, 624-8226");
        phoneBook.put("Волков Б.Г.", "826-4586");
        phoneBook.put("Валерьян А.В.", "686-4849");

        System.out.println(phoneBook.get("Иванов П.И."));
    }
}
