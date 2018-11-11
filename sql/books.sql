CREATE ROLE ashiras WITH LOGIN PASSWORD 'ASHIRAS';
docker exec -it postgres95 psql -U ashiras -d sample_db
CREATE DATABASE sample_db
    OWNER = ashiras;

CREATE TABLE Books (
  NAME      varchar(80)
);

insert into books values ('Angular');
insert into books values ('Spring boot');