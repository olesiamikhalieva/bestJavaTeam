package hw_19_05_18;
/*
2. Создать таблицу student :
name
ser_name
phone
email

где все поля не могут быть пустыми, а телефон и емейл  еще и уникальные.
INSERT INTO bestgroup.student (name, ser_name, phone, email) VALUES ('bim', 'frick', '+380503456785', 'bim@mail.ru');
INSERT INTO bestgroup.student (name, ser_name, phone, email) VALUES ('doberman', 'dog', '+380503456787', 'doberman@gmail.com');
INSERT INTO bestgroup.student (name, ser_name, phone, email) VALUES ('karl', 'bobovich', '+380503456789', 'bob@mail.ru');
INSERT INTO bestgroup.student (name, ser_name, phone, email) VALUES ('jon', 'karlov', '+380633456781', 'jon@mail.ru');
INSERT INTO bestgroup.student (name, ser_name, phone, email) VALUES ('toma', 'karlova', '+380633456782', 'toma@mail.ru');
INSERT INTO bestgroup.student (name, ser_name, phone, email) VALUES ('ikka', 'bus', '+380633456788', 'ikka@mail.ru');
INSERT INTO bestgroup.student (name, ser_name, phone, email) VALUES ('fox', 'gordon', '+380683456784', 'fox@mail.ru');
INSERT INTO bestgroup.student (name, ser_name, phone, email) VALUES ('don', 'abramov', '+380903456786', 'don@mail.ru');
INSERT INTO bestgroup.student (name, ser_name, phone, email) VALUES ('dina', 'ivanova', '+380903456789', 'dina@mail.ru');
INSERT INTO bestgroup.student (name, ser_name, phone, email) VALUES ('den', 'ketch', '+380933456783', 'den@gmail.com');
INSERT INTO bestgroup.student (name, ser_name, phone, email) VALUES ('lila', 'karlova', '0000', 'lila@mail.ru');запустить скрипты заполнения базовыми данными.Сделать следующие выборки:выбрать имена студентов у которых оператор связи МТС.

выбрать имена студентов у которых оператор связи МТС и лайф.
выбрать имена студентов у которых оператор связи МТС или киевстар.
выбрать все данные по однофамильцам если есть таковые..

3. Подключить дома 2 дата сорса и MySQL и  Postgres. Создать тестовые таблицы.

4.Вывести в брауйзер данные пользователей таблицей(найти кнопку которая это делает в плагине).

Написать программу. Где,создать подключение к вашей БД с таблицей студенты из задачи
2.  Все ваши скрипты из задачи 2 и данной задачи, а также доп файлы должны быть в
директории ресурсы. Программа само собой должна быть протестирована.
Нужно найти способ сгенерировать данные таблицы в файл любого расширения.
После чего программно считать его.
И вывести в консоль:
количество студентов в таблице,
всех студентов которые имеют почту на домене gmail.ru.
вывести однофамильцевДалее написать программно скрипт который после запуска
скрипта добавит 30 новых студентов в таблицу.также программно написать скрипт
который создаст таблицу адрес со следующими столбцами:город, улица, дом.
а также скрипт который заполнит таблицу. При чем количество адресов должно
быть равным количеству студентов в вашей таблице студенты. После добавления 30 строк.
Все это делаем на основе уже изученного материала. Искать что то новое не нужно.

 */
public class Main {
}
/*
INSERT INTO "bestgroup.student" (name, ser_name, phone, email) VALUES ('bim', 'frick', '+380503456785', 'bim@mail.ru');

INSERT INTO "bestgroup.student" (name, ser_name, phone, email) VALUES ('doberman', 'dog', '+380503456787', 'doberman@gmail.com');

INSERT INTO "bestgroup.student" (name, ser_name, phone, email) VALUES ('karl', 'bobovich', '+380503456789', 'bob@mail.ru');

INSERT INTO "bestgroup.student" (name, ser_name, phone, email) VALUES ('jon', 'karlov', '+380633456781', 'jon@mail.ru');

INSERT INTO "bestgroup.student" (name, ser_name, phone, email) VALUES ('toma', 'karlova', '+380633456782', 'toma@mail.ru');

INSERT INTO "bestgroup.student" (name, ser_name, phone, email) VALUES ('ikka', 'bus', '+380633456788', 'ikka@mail.ru');

INSERT INTO "bestgroup.student" (name, ser_name, phone, email) VALUES ('fox', 'gordon', '+380683456784', 'fox@mail.ru');

INSERT INTO "bestgroup.student" (name, ser_name, phone, email) VALUES ('don', 'abramov', '+380903456786', 'don@mail.ru');

INSERT INTO "bestgroup.student" (name, ser_name, phone, email) VALUES ('dina', 'ivanova', '+380903456789', 'dina@mail.ru');

INSERT INTO "bestgroup.student" (name, ser_name, phone, email) VALUES ('den', 'ketch', '+380933456783', 'den@gmail.com');

INSERT INTO "bestgroup.student" (name, ser_name, phone, email) VALUES ('lila', 'karlova', '0000', 'lila@mail.ru');

SELECT * FROM "bestgroup.student" WHERE phone LIKE '+38063%' AND phone LIKE '+38050' OR phone LIKE '+38093%' AND phone LIKE '+38050';

SELECT * FROM "bestgroup.student" WHERE phone LIKE '+38050%' OR phone LIKE '+38068';

SELECT * FROM "bestgroup.student" WHERE ser_name IN ( SELECT ser_name
                                                      from "bestgroup.student" group BY ser_name HAVING count(ser_name)>1);





 */