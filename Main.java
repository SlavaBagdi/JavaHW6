package HW6;

//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//        1. ФИО,
//        2. номер читательского билета,
//        3. факультет,
//        4. дата рождения,
//        5. телефон.
//        6. Методы (экземпляра, без слова static)  takeBook(), returnBook().
//        7. Разработать программу, в которой создается массив объектов данного класса.
//        8. Перегрузить методы takeBook(), returnBook():
//        - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//        - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        - takeBook, который будет принимать переменное количество (Тип... parameterName) объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        9. Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
public class Main {

    public static void main(String[] args) {
        Book adventure = new Book("Приключения", "Роберт Льюис");
        Book dictionary = new Book("Словарь", "А.Н.Щукин");
        Book encyclopedia = new Book("Энциклопедия", "Бернар Вербер");

        Reader ivanov = new Reader("Иванов И. И.", 5535, "Прикладных наук", "31.07.1994", "88888888888");
        Reader petrov = new Reader("Петров П. П.", 6666, "Гриффиндор", "05.06.1990", "77777777777");

        ivanov.takeBook(3);
        ivanov.takeBook("Азбука", "Грокаем алгоритмы");
        ivanov.takeBook(adventure,dictionary,encyclopedia);
        ivanov.returnBook(3);
        ivanov.returnBook("Азбука", "Грокаем алгоритмы");
        ivanov.returnBook(adventure,dictionary,encyclopedia);
    }
}
