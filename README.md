# Автотест Leroy Merlin Greece
## :link:  <a target="_blank" href=https://www.leroymerlin.gr/gr>Leroy Merlin Greece</a>


## :page_with_curl: Содержание:

- <a href="#computer-сode_stack">Code stack</a>
- <a href="#computer-infrastructure_stack">Infrastructure stack</a>
- <a href="#clipboard-реализованные-проверки">Реализованные проверки</a>
- <a href="#robot-сборки-в-Jenkins">Сборки в Jenkins</a>
- <a href="#keyboard-запуск-из-терминала">Запуск из терминала</a>
- <a href="#bar_chart-allure-отчет">Allure отчет</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#robot-отчет-в-slack">Отчет в Slack</a>
- <a href="#film_projector-видео-пример-прохождения-тестов">Видео пример прохождения тестов</a>

## :computer: Code stack
<p align="left">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
</p>

## :computer: Infrastructure stack
<p align="left">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :clipboard: Реализованные проверки
  -  Проверка отсутствия в консоле errors
  -  Проверка наличия тайтла на главной странице
  -  Проверка наличия лого на главной странице
  -  Проверка тайтла на странице о компании
  -  Проверка функции добавления товара в корзину
    
## :robot: Сборки в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/view/C12-BochkarevAlexej/job/C12-BochkarevAlexej-leroy-tests/">Параметризированная сборка в Jenkins</a>

## :keyboard: Запуск из терминала
Локальный запуск всех тестов:
```
gradle clean test -Denv=config/local
```

Удаленный запуск всех тестов:
```
clean
test
 -Dbrowser=${BROWSER}
 -DbrowserSize=${BROWSER_SIZE}
 -DworkingHost=${WORKINGHOST}
 ```

## :bar_chart: Allure отчет
- ### Главный экран отчета
    
- ### Страница с проведенными тестами


## :robot: Отчет в Telegram
- ### Telegram notification message (all results)


## :robot: Отчет в Slack
- ### Slack notification message (only failed tests)


## :film_projector: Видео пример прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.

