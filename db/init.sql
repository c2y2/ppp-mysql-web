
/*创建数据库*/
create database pptpd default character set utf8;

use pptpd;

/*管理员表*/
create table pptpd_admin(
id int(11) not null primary key auto_increment,
username varchar(50) not null,
password varchar(45) not null,
status tinyint not null default 0,
usertype tinyint not null default 0, 
memo varchar(100)
);

insert into pptpd_admin(username,password,status,usertype,memo)
 values('pptpdSupperAdmin',password('admin123456'),1,1,'超级管理员');


/*vpn用户表*/
create table pptpd_user( 
id int(11) not null primary key auto_increment,
mgrid int(11) not null, 
username varchar(50) not null, 
password varchar(45) not null, 
status tinyint not null default 0, 
clientip varchar(15) not null, 
serverip varchar(15) not null,
startdate datetime not null,
enddate datetime not null,
memo varchar(100),
FOREIGN key(mgrid) REFERENCES pptpd_admin(id) ON DELETE CASCADE
);

