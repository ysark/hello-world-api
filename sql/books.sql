CREATE ROLE ashiras WITH LOGIN PASSWORD 'ASHIRAS';
docker exec -it postgres95 psql -U ashiras -d sample_db
CREATE DATABASE sample_db
    OWNER = ashiras;

DROP TABLE T_BOOKS;
CREATE TABLE T_BOOKS (
  name      VARCHAR(80),
  comments  VARCHAR(80)
);

insert into T_BOOKS values ('Angular', 'Angular の本');
insert into T_BOOKS values ('Spring boot', 'Spring boot の本');