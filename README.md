# Проект автотестов на сайт Unicom24.ru

Использованны слудующие технологии:

<p align="center">
<img width="16%" title="Gradle" src="media/Gradle.svg">
<img width="16%" title="Java" src="media/Java.svg">
<img width="16%" title="JUnit5" src="media/JUnit5.svg">
<img width="16%" title="IntelliJ IDEA" src="media/Intelij_IDEA.svg">
<img width="16%" title="Selenide" src="media/Selenide.svg">
<img width="16%" title="Allure Report" src="media/Allure_Report.svg">
<img width="16%" title="GitHub" src="media/GitHub.svg">
<img width="16%" title="Jenkins" src="media/Jenkins.svg">
<img width="16%" title="Selenoid" src="media/Selenoid.svg">
</p>

# Запуск тестов
Запуск осуществляется командой: 
```
gradle clean test
```
Для запуска тестов в Jenkins используется следующая команда:
```
clean
test
-Dbrowser=${BROWSER}
-Dversion=${VERSION}
```
где:

`${BROWSER}` - тип браузера для тестов, 

`${VERSION}` - версия браузера.

# Запуск тестов в Jenkins выглядит следующим образом
Главная страница сборки
![](/home/sergey/IdeaProjects/qa_guru_13/media/JenkinsJob.svg)

Выбор параметров сборки
![](/home/sergey/IdeaProjects/qa_guru_13/media/JenkinsJobStart.svg)

Работа сборки
![](/home/sergey/IdeaProjects/qa_guru_13/media/JenkinsJobWork.svg)

Отчет о выполнении тестов
![](/home/sergey/IdeaProjects/qa_guru_13/media/AllureReport.svg)

Каждый тесте, независимо от результата, состоит из:
- начальных параметров,
- шагов, 
- скриншота браузера,
- исходного кода страницы,
- лога консоли браузера,
- видео выполнения теста.

![](/home/sergey/IdeaProjects/qa_guru_13/media/AllureReportAll.svg)

По резултатам работы тестов отправляется краткий отчет в Telegram
![](/home/sergey/IdeaProjects/qa_guru_13/media/TelegramBot.svg)

# Пример прохождения теста на удаленной машине
![](/home/sergey/IdeaProjects/qa_guru_13/media/Test.gif)


