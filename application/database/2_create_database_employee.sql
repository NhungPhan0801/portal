use portal;

create table employee(
  employeeid bigint primary key not null auto_increment,
  firstname nvarchar(50),
  lastname nvarchar(50),
  birthday timestamp,
  address nvarchar(50),
  email nvarchar(50),
  phone bigint(20),
  currentSalary bigint,
  hireDate timestamp,
  quitDate timestamp,
  avatarfile blob

);
