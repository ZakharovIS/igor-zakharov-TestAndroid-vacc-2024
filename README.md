# igor-zakharov-TestAndroid-vacc-2024
Food Delivery Test App

[Screen_recording_20240527_035729.webm](https://github.com/ZakharovIS/igor-zakharov-TestAndroid-vacc-2024/assets/60730978/79251705-f6c3-4fa0-b696-fb70d2ddc036)

| Реализовано: | Многомодульная архитектура, MVVM, DI                                                                                                                                             |
|--------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Надо сделать | Разделение Feature - Api<br>Базовые классы фрагментов и ВМ<br>Навигация (Кастом или Cicerone)<br>Обработка ошибок<br>UseCase<br>Перейти на Compose, чтоб не мучаться с вёрсткой) |

## План работы

| ЗАДАЧА                               | ОПИСАНИЕ                                                                        | ИСХОДНАЯ <br>ОЦЕНКА | ПОТРАЧЕННОЕ <br>ВРЕМЯ | ГОТОВНОСТЬ |                            ПРИМЕЧАНИЕ                           |
|--------------------------------------|---------------------------------------------------------------------------------|:-------------------:|:---------------------:|:----------:|:---------------------------------------------------------------:|
| 1. Настройка окружения и проекта     | Создание проекта в AS, настройка Gradle,<br>добавление зависимостей             |          1          |           1           |     80%    |                  Оптимизировать<br>зависимости                  |
| 2. Создание структуры модулей        | Создание базовой модели модульной архитектуры:<br>app-base-feature-api          |          2          |           3           |    100%    |                                                                 |
| 3. Разработка базовых DI компонентов | Первичная настройка Dagger2, граф зависимостей                                  |          2          |           4           |    100%    |                                                                 |
| 4. Модуль работы с сетью             | Подключение Retrofit, сопутствующие утилиты                                     |          1          |           1           |    100%    |                                                                 |
| 5. Главный экран                     |                                                                                 |                     |                       |            |                                                                 |
| 5.1 UI                               | Разработка макета главного экрана, Recycler View,<br>Bottom Navigation          |          2          |           4           |     70%    | Нет обработки ошибок,<br>добавить функционал,<br>сделать дизайн |
| 5.2 Данные для главного экрана       | Модели данных, ViewModel, Repository                                            |          2          |           2           |    100%    |                                                                 |
| 5.3 Переход к описанию товара        | Навигация с передачей данных                                                    |          1          |           1           |     20%    |                          Нет навигации                          |
| 6. Детали товара                     |                                                                                 |                     |                       |            |                                                                 |
| 6.1 UI                               | Разработка макета                                                               |          2          |           1           |     70%    | Нет обработки ошибок,<br>добавить функционал,<br>сделать дизайн |
| 6.2 Данные для деталей товара        | Модели данных, ViewModel, Repository                                            |          2          |           2           |    100%    |                                                                 |
| 7. Тестирование и отладка            | Юнит-тесты, исправление ошибок, проверка интерфейса и<br>функционала приложения |          3          |           0           |     0%     |                        Не хватило времени                       |
|                                      |                                                                                 |        ВСЕГО        |         ВСЕГО         |            |                                                                 |
|                                      |                                                                                 |          19         |           19          |            |                                                                 |

