import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
        public static void task1 () {


        //task1
        //Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в
        // неструктурированном формате, и бухгалтерия попросила написать программу,
        // в которой можно работать с Ф.И.О. сотрудников.
        //  Напишите четыре строки:
        // первая с именем firstName — для хранения имени;
        //вторая с именем middleName — для хранения отчества;
        //третья с именем lastName — для хранения фамилии;
        //четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
        //Выведите в консоль фразу: “ФИО сотрудника — ….”
        // В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;

        System.out.print(" ФИО сотрудника — " + fullName);
    }

    public static void task2() {

    //task2
    //Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны
    // Ф.И.О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
    //Напишите программу, которая изменит написание Ф. И. О. сотрудника с
    // “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
    //В качестве строки с исходными данными используйте строку fullName.
    //Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
    //- Критерии оценки

    String firstName = "Ivan ";
    String middleName = "Ivanovich ";
    String lastName = "Ivanov ";
    String fullName = firstName + middleName + lastName;
    String result = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " +  result );
     }

    public static void task3() {
        //Система, в которой мы работаем, не принимает символ “ё”.
        //Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        //В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        //Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        //- **Подсказка**
        //Может потребоваться метод split() и метод contains().

        var fullName = "Иванов Семён Семёнович";
        var split = fullName.split(" ");
        String result = "";
        for ( String current : split) {
            if (current.contains("ё")) {
                var replacement = current.replace("ё", "е");
                result += replacement;
            } else {
                result += current;
            }
            result += " ";
        }
        System.out.printf("Данные ФИО сотрудника — %s" , result );

            }
        }






