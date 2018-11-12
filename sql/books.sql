CREATE ROLE ashiras WITH LOGIN PASSWORD 'ASHIRAS';
docker exec -it postgres95 psql -U ashiras -d sample_db
CREATE DATABASE sample_db
    OWNER = ashiras;

DROP TABLE books;
CREATE TABLE books (
  name      VARCHAR(80),
  comments  VARCHAR(80)
);

insert into books values ('Angular', 'Angular の本');
insert into books values ('Spring boot', 'Spring boot の本');