use portal;
create table User(
  userid bigint primary key not null ,
  username nvarchar(50),
  password nvarchar(20)

);
