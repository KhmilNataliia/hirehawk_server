use functions of dao.FeedbackDAO in your service:

1) saveFeedback(int mark, String comment, Date datetime, Integer userWhoLeft, Integer userAbout, USERROLE userAboutRole);
�������  ������, ��������, ���� � ���, ����������� ��� ������� � ��� ����,� ������� ��� �������� (������� �� ���, ��� ��� � ������  ).

2) saveFeedback(int mark, Date datetime, Integer userWhoLeft, Integer userAbout, USERROLE userAboutRole);
������� ������, ���� � ���, ����������� ��� ������� � ��� ����(������� �� ���, ��� ��� � ������  ).

3) getFeedbacks(int user, USERROLE role);
getFeedbacks(int user, USERROLE role, int num);
�������� ����� ������� ������ � ����������� � ��� ��������� (������� �� ��������) ��� ������� �����������(�� ��������,�� ���� ��� ��� � ������, ��������� �� ��� ).
 ����������� ����������� �������� �� �����.

4)getFeedbacksWithoutComments(int user, USERROLE role);
getFeedbacksWithoutComments(int user, USERROLE role, int num);
�������� ����� ������� ������ ��� ��������� (������� �� ��������) ��� ������� �����������(�� ��������,�� ���� ��� ��� � ������, ��������� �� ��� ). 
����������� ����������� �������� �� �����.

5)getFeedbacksWithComments(int user, USERROLE role);
getFeedbacksWithComments(int user, USERROLE role, int num);
�������� ����� ������� ������ � ����������� (������� �� ��������) ��� ������� �����������(�� ��������,�� ���� ��� ��� � ������, ��������� �� ��� ) .
�����������  ����������� �������� �� �����.


use scripts from file "DB_scripts.txt" to create database in mysql

