Feature: Main menu

   @main_menu
   #@ignore
   Scenario: Open main menu 
       Given user navigates to main page
       When user clicks main menu sandwich button
       Then the user sees the menu blocks
       And the blocks count is "7"
   
   @menu_items
   #@ignore
   Scenario Outline: Check the menu items
       Given user navigates to main page
       When user clicks main menu sandwich button
       And the user selects the menu item with index '<item_index>'
       Then the page '<item_page>' is opened
       Examples:
           | item_index | item_page                         |
           |     1      | О предприятии                     |
           |     2      | История                           |
           |     3      | Руководство                       |
           |     4      | Реквизиты                         |
           |     5      | "Они сражались за Родину"         |
           |     6      | Профсоюзная деятельность          |
           |     7      | Дополнительная информация         |
           |     8      | Противодействие коррупции         |
           |     9      | Подразделениям                    |

           |     14     | Для потребителей                  |
           |     15     | Информационная карта испытательной лаборатории химслужбы  |
           |     16     | Информация о должниках            |
           |     17     | Юридическим лицам                 |
           |     18     | Физическим лицам                  |
           |     19     | Оплата услуг                                  |
           |     20     | Подключение к системе теплоснабжения                      |
           |     21     | Тарифы                            |

           |     10     | Услуги                            |
           |     11     | Заключение договоров              |
           |     12     | Оплата услуг предприятия          |
           |     13     | Услуги по прейскуранту            |

           |     22     | Пресс-центр                       |
           |     23     | Вопрос-ответ                      |
           |     24     | Объявления                        |
           |     25     | Фотогалерея                       |
           |     26     | Новости                           |
           |     27     | Видеогалерея                      |

           |     28     | Закупки                           |
           |     29     | Положение о закупках              |
           |     30     | План закупок                      |
           |     31     | Реализация неликвидов             |

           |     32     | Контакты                          |

           #|     33     | Личный кабинет                    |
           |     34     | Вакансии                          |