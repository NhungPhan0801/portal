use portal;
create table role(
  roleid bigint primary key not null,
  username nvarchar(50),
  password nvarchar(20)
);