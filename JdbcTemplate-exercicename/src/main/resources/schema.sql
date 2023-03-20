/* Fichier schema.sql */
create table if not exists student (
id varchar(10) not null,
name varchar(25) not null,
birthDate Date not null,
email varchar(50) not null
);
