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
           |     7      | Противодействие коррупции         |
           |     8      | Дополнительная информация         |
           |     9      | Подразделениям                    |

           |     10     | Для потребителей                  |
           |     11     | Информационная карта испытательной лаборатории химслужбы  |
           |     12     | Юридическим лицам                 |
           |     13     | Информация о должниках            |
           |     14     | Физическим лицам                  |
           |     15     | Подключение к системе теплоснабжения                      |
           |     16     | Тарифы                            |

           |     17     | Услуги                            |
           |     18     | Заключение договоров              |
           |     19     | Оплата услуг предприятия          |
           |     20     | Услуги по прейскуранту            |

           |     21     | Пресс-центр                       |
           |     22     | Вопрос-ответ                      |
           |     23     | Новости                           |
           |     24     | Объявления                        |
           |     25     | Фотогалерея                       |
           |     26     | Видеогалерея                      |

           |     27     | Закупки                           |
           |     28     | Положение о закупках              |
           |     29     | План закупок                      |
           |     30     | Реализация неликвидов             |

           |     31     | Контакты                          |

           #|     32     | Личный кабинет                    |
           |     33     | Вакансии                          |