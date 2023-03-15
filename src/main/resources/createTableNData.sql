
drop database if exists testdb;
create database testdb;
use testdb;


select * from book;
insert into book(title, author, year) values
('Gone with the wind', 'Hankle', 1954),
('Pari, Paris, Paris', 'Peter', 2020),
('The world is flat', 'Thomas', 2010),
('Doraemon', 'Matuso', 1990),
('Women in lov', 'Laura', 2000),
('Men in black', 'Lacey', 2010),
('Recipe for happiness', 'Thang', 2000),
('Village Idiots', 'Thu', 1990),
('Peace and War', 'Lev tolstoi', 1900),
('Hello Kitty', 'Henry', 1990),
('Shopping and Cooking', 'Bolzano', 2000);

select * from user;
insert into user(username, password) values
('user1', 'password'),
('user2', 'password'),
('user3', 'password'),
('user4', 'password'),
('mod5', 'password'),
('mod6', 'password'),
('mod7', 'password'),
('mod8', 'password'),
('admin9', 'password'),
('admin10', 'password'),
('admin11', 'password');

insert into users_roles (user_id, role_id) values 
(1, 1), 
(2, 2),
(3, 1),
(4, 2),
(5, 1),
(6, 2),
(7, 1),
(8, 1),
(9, 1),
(10, 1),
(11, 1);

delete from review;
insert into review(user_id, book_id, comment, rate, date) values
(1, 1, 'comment 1 1', 3, '2023/02/22'),
(2, 2, 'comment 2 2', 4, '2022/02/12'),
(3, 3, 'comment 3 3', 5, '2021/05/23'),
(4, 4, 'comment 4 4', 1, '2023/12/21'),
(5, 5, 'comment 5 5', 2, '2023/06/22'),
(6, 6, 'comment 6 6', 3, '2023/11/26'),
(7, 7, 'comment 7 7', 4, '2023/04/27'),
(8, 8, 'comment 8 8', 5, '2023/10/12'),
(9, 9, 'comment 9 9', 3, '2023/09/02'),
(10, 10, 'comment 10 10', 2, '202`/04/22'),
(11, 11, 'comment 11 11', 1, '2020/05/07'),
(1, 2, 'comment 1 2', 3, '2021/02/12'),
(1, 3, 'comment 1 3', 4, '2023/08/04'),
(1, 4, 'comment 1 4', 5, '2023/12/06'),
(1, 5, 'comment 1 5', 1, '2023/11/08');
