# Автотест Leroy Merlin Greece
link https://www.leroymerlin.gr/gr
page_with_curl Содержание:

    Code stack
    Infrastructure stack
    Реализованные проверки
    Сборки в Jenkins
    Запуск из терминала
    Allure отчет
    Отчет в Telegram
    Отчет в Slack
    Видео пример прохождения тестов

computer Code stack

[Java] [Selenide] [Allure Report] [Gradle] [JUnit5]
computer Infrastructure stack

[IntelliJ IDEA] [Selenoid] [GitHub] [Jenkins] [Telegram]
clipboard Реализованные проверки

    Проверка наличия текста "QA" в названии вакансии heavy_check_mark
    Проверка соответствия вакансии на необходимый тип работы: удаленная работа heavy_check_mark
    Проверка соответствия вакансии на наличие необходимых навыков: Selenoid heavy_check_mark
    Проверка перехода на ввод кода при вводе валидного Email и отклике на вакансию x (тест failed для отражения статуса failed в отчетах)
    Проверка наличия ошибки при вводе неверного формата Email heavy_minus_sign (тест Disabled для отражения статуса skipped в отчетах)

robot Сборки в Jenkins
Параметризированная сборка в Jenkins со всеми тестами

[Jenkins Job Run with parameters]

[Jenkins Dashboard]
Сборка в Jenkins со Smoke тестами

[Jenkins Dashboard]
keyboard Запуск из терминала

Локальный запуск всех тестов:

gradle clean test

Локальный запуск только Smoke тестов (c тегом Smoke):

gradle clean smoke_tests

Удаленный запуск всех тестов:

clean
test
 -Dbrowser=${BROWSER}
 -DbrowserVersion=${BROWSER_VERSION}
 -DbrowserSize=${BROWSER_SIZE}
 -DbaseUrl=${BASE_URL}
 -Dremote=${REMOTE}

Удаленный запуск только Smoke тестов (c тегом Smoke):

clean
smoke_tests
 -Dbrowser=${BROWSER}
 -DbrowserVersion=${BROWSER_VERSION}
 -DbrowserSize=${BROWSER_SIZE}
 -DbaseUrl=${BASE_URL}
 -Dremote=${REMOTE}

bar_chart Allure отчет

    Главный экран отчета

[Allure Overview Dashboard]

    Страница с проведенными тестами

[Allure Test Page]
robot Отчет в Telegram

    Telegram notification message (all results)

[Telegram notification message (all results)]
robot Отчет в Slack

    Slack notification message (only failed tests)

[Slack notification message (only failed tests)]
film_projector Видео пример прохождения тестов

    К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.

[Selenoid Video] 
