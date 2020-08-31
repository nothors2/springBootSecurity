insert into users(username,password,enabled)
VALUES("user","1111",true);
insert into users(username,password,enabled)
VALUES("admin","1111",true);

insert into authorities(username,authority)
VALUES("user","Role_USER");
insert into authorities(username,authority)
VALUES("admin","Role_ADMIN");
