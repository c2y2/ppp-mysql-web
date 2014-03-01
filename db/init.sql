
/*创建数据库*/
create database pptpd default character set utf8;

use pptpd;

/*管理员表*/
create table pptpd_admin(
id int(11) not null primary key auto_increment,
username varchar(30) not null,
password varchar(32) not null,
status tinyint not null default 0, 
memo varchar(100)
);


/*vpn用户表*/
create table pptpd_user( 
id int(11) not null primary key auto_increment, 
username varchar(30) not null, 
password varchar(32) not null, 
status tinyint not null default 0, 
clientip varchar(15) not null, 
serverip varchar(15) not null
);
