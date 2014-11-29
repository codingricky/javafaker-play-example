# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table customer (
  id                        bigint not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  title                     varchar(255),
  street_address            varchar(255),
  constraint pk_customer primary key (id))
;

create sequence customer_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists customer;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists customer_seq;

