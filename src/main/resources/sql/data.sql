CREATE TABLE IF NOT EXISTS tb_admin (
                                                id INT AUTO_INCREMENT PRIMARY KEY,
                                                name VARCHAR(15) NULL,
    gender CHAR NULL,
    password VARCHAR(100) NULL,
    email VARCHAR(50) NULL,
    telephone VARCHAR(12) NULL,
    address VARCHAR(100) NULL,
    portrait_path VARCHAR(200) NULL
    ) ;

CREATE TABLE IF NOT EXISTS tb_clazz (
                                                id INT AUTO_INCREMENT PRIMARY KEY,
                                                name VARCHAR(15) NULL,
    number INT NULL,
    introducation VARCHAR(200) NULL,
    headmaster VARCHAR(15) NULL,
    email VARCHAR(50) NULL,
    telephone VARCHAR(12) NULL,
    grade_name VARCHAR(15) NULL
    ) ;

CREATE TABLE IF NOT EXISTS tb_grade (
                                                id INT AUTO_INCREMENT,
                                                name VARCHAR(15) DEFAULT '' NOT NULL,
    manager VARCHAR(15) NULL,
    email VARCHAR(50) NULL,
    telephone VARCHAR(12) NULL,
    introducation VARCHAR(200) NULL,
    PRIMARY KEY (id, name)
    ) ;

CREATE TABLE IF NOT EXISTS tb_student (
                                                  id INT AUTO_INCREMENT PRIMARY KEY,
                                                  sno VARCHAR(20) NULL,
    name VARCHAR(15) NULL,
    gender CHAR NULL,
    password VARCHAR(100) NULL,
    email VARCHAR(50) NULL,
    telephone VARCHAR(12) NULL,
    address VARCHAR(100) NULL,
    introducation VARCHAR(200) NULL,
    portrait_path VARCHAR(200) NULL,
    clazz_name VARCHAR(15) NULL
    ) ;

CREATE TABLE IF NOT EXISTS tb_teacher (
                                                  id INT AUTO_INCREMENT PRIMARY KEY,
                                                  tno VARCHAR(20) NULL,
    name VARCHAR(15) NULL,
    gender CHAR NULL,
    password VARCHAR(100) NULL,
    email VARCHAR(50) NULL,
    telephone VARCHAR(12) NULL,
    address VARCHAR(100) NULL,
    portrait_path VARCHAR(200) NULL,
    clazz_name VARCHAR(15) NULL
    ) ;

insert into tb_admin  (id, name, gender, password, email, telephone, address, portrait_path)
values  (101, 'admin', 'F', '21232f297a57a5a743894a0e4a801fc3', '111111@gmail.com', '13260161111', 'Istanbul', 'upload/default.jpg'),
        (102, 'admin1', 'M', '21232f297a57a5a743894a0e4a801fc3', '512111559@gmail.com', '13260166090', 'Istanbul', 'upload/default.jpg'),
        (103, 'admin2', 'M', '21232f297a57a5a743894a0e4a801fc3', '512111559@gmail.com', '13260166091', 'Istanbul', 'upload/default.jpg'),
        (104, 'admin3', 'M', '21232f297a57a5a743894a0e4a801fc3', '123456@gmail.com', '13666666666', 'Ankara', 'upload/default.jpg');


insert into tb_clazz (id, name, number, introducation, headmaster, email, telephone, grade_name)
values  (1, 'Class 1', 30, 'This is a test information', 'Ahmed', 'Ahmed@gmail.com', '13260166090', 'Grade 6'),
        (2, 'Class 2', 28, 'This is a test information', 'Abdushkur', 'Abdushkur@gmail.com', '13260166090', 'Grade 1'),
        (3, 'Class 3', 35, 'This is a test information', 'Ahmed', 'Ali@gmail.com', '13260166090', 'Grade 2'),
        (4, 'Class 4', 30, 'This is a test information', 'Ali', 'Ali@gmail.com', '13260166090', 'Grade 2'),
        (5, 'Class 5', 30, 'This is a test information', 'Asim', 'Asim@gmail.com', '13260166090', 'Grade 3'),
        (6, 'Class 4', 30, 'This is a test information', 'Muhammed', 'Muhammed@gmail.com', '13260166090', 'Grade 3'),
        (7, 'Class 2', 30, 'This is a test information', 'Aburahman', 'Aburahman@gmail.com', '13260166090', 'Grade 4');


insert into tb_grade (id, name, manager, email, telephone, introducation)
values  (1, 'Grade 1', 'muhsin', 'muhsin@gmail.com', '13260166090', 'This is a test information'),
        (2, 'Grade 2', 'ali', 'ali@gmail.com', '13260166090', 'This is a test information'),
        (3, 'Grade 3', 'abdurahman', 'abdurahman@gmail.com', '13666666666', 'This is a test information'),
        (4, 'Grade 5', 'abdulla', 'ali@gmail.com', '13666666666', 'This is a test information'),
        (5, 'Grade 6', 'Abdushkur', 'Abdushkur@gmail.com', '13666666666', 'This is a test information');



insert into tb_student (id, sno, name, gender, password, email, telephone, address, introducation, portrait_path, clazz_name)
values  (1, '1001', 'Ahmed', 'M', 'e10adc3949ba59abbe56e057f20f883e', 'Ahmed@gmail.com', '13260166090', 'Ankara', 'This is a test information', 'upload/default.jpg', 'Class 1'),
        (2, '1002', 'Museb', 'M', 'e10adc3949ba59abbe56e057f20f883e', 'Museb@gmail.com', '13260166090', 'Ankara', 'This is a test information', 'upload/default.jpg', 'Class 2'),
        (3, '1003', 'Nefise', 'F', 'e10adc3949ba59abbe56e057f20f883e', 'Nefise@gmail.com', '13260166090', 'Ankara', 'This is a test information', 'upload/default.jpg', 'Class 1'),
        (4, '1004', 'Abdulla', 'M', 'e10adc3949ba59abbe56e057f20f883e', 'Abdulla@gmail.com', '13260166090', 'Ankara', 'This is a test information', 'upload/default.jpg', 'Class 2'),
        (5, '1005', 'Abdurahman', 'M', 'e10adc3949ba59abbe56e057f20f883e', 'Abdurahman@gmail.com', '13260166090', 'Ankara', 'This is a test information', 'upload/default.jpg', 'Class 1'),
        (6, '1006', 'Abdushkur', 'M', 'e10adc3949ba59abbe56e057f20f883e', 'Abdushkur@gmail.com', '13260166090', 'Istanbul', 'This is a test information', 'upload/default.jpg', 'Class 1'),
        (7, '1007', 'Fatma', 'F', 'e10adc3949ba59abbe56e057f20f883e', 'Fatma@gmail.com', '13260166090', 'Ankara', 'This is a test information', 'upload/default.jpg', 'Class 3'),
        (8, '1008', 'Yusuf', 'M', 'e10adc3949ba59abbe56e057f20f883e', 'Yusuf@gmail.com', '13260166090', 'Konya', 'This is a test information', 'upload/default.jpg', 'Class 2');


insert into tb_teacher (id, tno, name, gender, password, email, telephone, address, portrait_path, clazz_name)
values  (1, '101', 'Meryem', 'F', '123456', 'dasheng@gmail.com', '13260166090', 'Meryem', 'upload/default.jpg', 'Class 3'),
        (2, '102', 'Abdulla', 'M', 'e10adc3949ba59abbe56e057f20f883e', 'Abdulla@gmail.com', '13260166090', 'Istanbul', 'upload/default.jpg', 'Class 2'),
        (3, '103', 'Ali', 'M', 'e10adc3949ba59abbe56e057f20f883e', 'Ali@gmail.com', '13260166090', 'Bursa', 'upload/default.jpg', 'Class 2'),
        (4, '104', 'Muhemmed', 'M', 'e10adc3949ba59abbe56e057f20f883e', 'Muhemmed@gmail.com', '13260166090', 'Istanbul', 'upload/default.jpg', 'Class 3'),
        (5, '105', 'Isa', 'M', 'e10adc3949ba59abbe56e057f20f883e', 'Isa@gmail.com', '13260166090', 'Istanbul', 'upload/default.jpg', 'Class 4'),
        (6, '106', 'Erkin', 'M', 'e10adc3949ba59abbe56e057f20f883e', 'Erkin@gmail.com', '13260166090', 'Ankara', 'upload/default.jpg', 'Class 1'),
        (7, '107', 'Tekin', 'M', 'e10adc3949ba59abbe56e057f20f883e', 'Tekin@gmail.com', '13260166090', 'Istanbul', 'upload/default.jpg', 'Class 5'),
        (8, '108', 'Tumaris', 'F', 'e10adc3949ba59abbe56e057f20f883e', 'Tumaris@gmail.com', '13855555555', 'Istanbul', 'upload/12fe07bf8b6d493b96294f1ef0552339default.jpg', 'Class 3');


