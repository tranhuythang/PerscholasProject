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

select * from users_roles;
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
(1, 1, 'Lorem ipsum dolor sit amet. Est tempore voluptatem non', 3, '2023/02/22'),
(2, 2, 'reprehenderit voluptas eum aspernatur aliquid est eligendi similique', 4, '2022/02/12'),
(3, 3, 'Et assumenda quidem et quam cumque qui excepturi suscipit et', 5, '2021/05/23'),
(4, 4, 'magnam autem ad galisum vero aut voluptas odit. Et molestiae', 1, '2023/12/21'),
(5, 5, 'voluptatem id quia quaerat ex architecto voluptatem. Qui', 2, '2023/06/22'),
(6, 6, 'reprehenderit distinctio aut dolor voluptas ut minus rerum ut vitae', 3, '2023/11/26'),
(7, 7, 'Qui fuga itaque in quas galisum ex quae repudiandae ut beatae', 4, '2023/04/27'),
(8, 8, 'labore cum atque eius et placeat internos vel iusto illo. Non vitae', 5, '2023/10/12'),
(9, 9, 'animi quo distinctio doloribus sed internos neque. Aut autem', 3, '2023/09/02'),
(10, 10, 'similique est consectetur consequatur aut laudantium error et', 2, '202`/04/22'),
(11, 11, 'sequi et eveniet esse et laborum distinctio sit illum illum qui amet', 1, '2020/05/07'),
(1, 2, 'Sit delectus atque et nobis modi ut nihil rerum ut sunt minus sed', 3, '2021/02/12'),
(1, 3, 'perspiciatis fugiat ut temporibus dolore sed quas enim aut fugit nisi', 4, '2023/08/04'),
(1, 4, 'sit culpa quis eos reprehenderit consequuntur ut corporis', 5, '2023/12/06'),
(1, 5, 'corrupti quas ut galisum repellat sed sint nulla? Eos consequatur', 1, '2023/11/08');

select * from review;
update user set password = '$2a$10$RPUVFjEBHkGHDf7yI9owNOvFzRPkEsl2cc/zYPrTYOAfjc6ptBHBC';
delete from review where id=15;