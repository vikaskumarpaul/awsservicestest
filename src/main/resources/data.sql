use awsservicestest;

delete from authorities where username = 'vikas.paul@gmail.com';
delete from authorities where username = 'yogivikaspaul@gmail.com';
delete from authorities where username = 'er.vikaspaul@gmail.com';
delete from authorities where username = 'vikas.paul123@gmail.com';
delete from authorities where username = 'vikas.paul456@gmail.com';

delete from users where username = 'vikas.paul@gmail.com';
delete from users where username = 'yogivikaspaul@gmail.com';
delete from users where username = 'er.vikaspaul@gmail.com';
delete from users where username = 'vikas.paul123@gmail.com';
delete from users where username = 'vikas.paul456@gmail.com';

insert into users values('vikas.paul@gmail.com', 'Amdocs@123', 1);
insert into users values('yogivikaspaul@gmail.com', 'Amdocs@123', 1);
insert into users values('er.vikaspaul@gmail.com', 'Amdocs@123', 1);
insert into users values('vikas.paul123@gmail.com', 'Amdocs@123', 0);
insert into users values('vikas.paul456@gmail.com', 'Amdocs@123', 0);

insert into authorities values('vikas.paul@gmail.com', 'admin');
insert into authorities values('yogivikaspaul@gmail.com', 'admin');
insert into authorities values('er.vikaspaul@gmail.com', 'admin');
insert into authorities values('vikas.paul123@gmail.com', 'admin');
insert into authorities values('vikas.paul456@gmail.com', 'admin');