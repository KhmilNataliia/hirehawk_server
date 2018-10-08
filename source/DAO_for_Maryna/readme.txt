use functions of dao.FeedbackDAO in your service:

1) saveFeedback(int mark, String comment, Date datetime, Integer userWhoLeft, Integer userAbout, USERROLE userAboutRole);
Зберігти  оцінку, коментар, дату й час, користувача хто залишив і про кого,з приводу якої діяльності (орендар чи той, хто здає в оренду  ).

2) saveFeedback(int mark, Date datetime, Integer userWhoLeft, Integer userAbout, USERROLE userAboutRole);
Зберігти оцінку, дату й час, користувача хто залишив і про кого(орендар чи той, хто здає в оренду  ).

3) getFeedbacks(int user, USERROLE role);
getFeedbacks(int user, USERROLE role, int num);
Отримати певну кількість оцінок з коментарями і без коментарів (кількість як параметр) про певного користувача(як орендаря,як того хто здає в оренду, незалежно від ролі ).
 Передбачити необхідність отримати всі наявні.

4)getFeedbacksWithoutComments(int user, USERROLE role);
getFeedbacksWithoutComments(int user, USERROLE role, int num);
Отримати певну кількість оцінок без коментарів (кількість як параметр) про певного користувача(як орендаря,як того хто здає в оренду, незалежно від ролі ). 
Передбачити необхідність отримати всі наявні.

5)getFeedbacksWithComments(int user, USERROLE role);
getFeedbacksWithComments(int user, USERROLE role, int num);
Отримати певну кількість оцінок з коментарями (кількість як параметр) про певного користувача(як орендаря,як того хто здає в оренду, незалежно від ролі ) .
Передбачити  необхідність отримати всі наявні.


use scripts from file "DB_scripts.txt" to create database in mysql

