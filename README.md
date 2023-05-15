# Employee details spring boot app 
##### This application provide employee information using rest api and store the employee details in DB 
<!-- HTML approach -->
<img src="https://github.com/utsav-galphat/spring-boot-rest-crud-demo/blob/master/EMPLOYEE.png"/>



#### Please execute below queries to create db table 

>CREATE DATABASE  IF NOT EXISTS `employee_directory`;
> 
>USE `employee_directory`;

Table structure for table `employee`

>DROP TABLE IF EXISTS `employee`;

>CREATE TABLE `employee` (
>`id` int NOT NULL AUTO_INCREMENT,
>`first_name` varchar(45) DEFAULT NULL,
>`last_name` varchar(45) DEFAULT NULL,
>`email` varchar(45) DEFAULT NULL,
>PRIMARY KEY (`id`)
>) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

Data for table `employee`


>INSERT INTO `employee` VALUES
(1,'Adams','Andres','leslie@test.com'),
(2,'Emma','Watson','emma@yahoo.com'),
(3,'Avani','Gupta','avani@gmail.com'),
(4,'Yuri','Medvev','yuri@gmail.com'),
(5,'Juan','Vega','juan@hotmail.com');

