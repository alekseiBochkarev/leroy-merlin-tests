# Автотест Leroy Merlin Greece
<img title="Leroy img" src="images/leroySite.png">

## :link:  <a target="_blank" href=https://www.leroymerlin.gr/gr>Leroy Merlin Greece</a>


## :page_with_curl: Содержание:

- <a href="#computer-сode_stack">Стек разработки</a>
- <a href="#computer-infrastructure_stack">Инфраструктура</a>
- <a href="#clipboard-реализованные-проверки">Реализованные проверки</a>
- <a href="#robot-сборки-в-Jenkins">Сборки в Jenkins</a>
- <a href="#keyboard-запуск-из-терминала">Запуск из терминала</a>
- <a href="#bar_chart-allure-отчет">Allure отчет</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#film_projector-видео-пример-прохождения-тестов">Видео пример прохождения тестов</a>

## :computer: Стек разработки
<p align="left">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
</p>

## :computer: Инфраструктура
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
*Для запуска сборки необходимо указать значения параметров и нажать кнопку <code><strong>*Собрать с параметрами*</strong></code>.*

<p align="center">
  <img src="images/screenshots/Jenkins.png">
</p>

<p align="center">
  <img src="images/screenshots/Jenkins2.png">
</p>

## :keyboard: Запуск из терминала
Локальный запуск всех тестов:
```
gradle clean test -Denv=config/local
```

Удаленный запуск всех тестов:
```
clean
test
 -Denv=${ENV}
 -Dbrowser=${BROWSER}
 -DbrowserSize=${BROWSER_SIZE}
 -DworkingHost=${WORKINGHOST}
 ```

### Параметры сборки

> <code>ENV</code> – окружение, в котором буду запускаться тесты (локально или удаленно) (_по умолчанию - <code>remote</code>_).
>
> <code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>BROWSER_SIZE</code> – разрешени окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).
>
> <code>WORKINGHOST</code> – адрес ресурса, который будет протестирован.
>

## :bar_chart: Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure-main-page.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="images/screenshots/allure-test-page.png">
</p>

## :hammer: Allure Test Ops отчет
<p align="center">
<img title="Allure Test Ops Launch" src="images/allureLeroyMerlinLaunch.png">
<img title="Allure Test Ops Dashboard" src="images/AllureLeroyDashboard.png">
</p>

## :robot: Отчет в Telegram
- ### Telegram оповещение
<p align="center">
<img title="Telegram notification message (all results)" src="images/screenshots/telegram-bot.png">
</p>

## :film_projector: Видео пример прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/test-run.gif">
</p>
