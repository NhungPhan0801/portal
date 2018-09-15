use  portal;
alter table employee add COLUMN userid bigint not null ;

alter table employee add constraint fk_empolyee_user foreign key (userid)references user(userid);
