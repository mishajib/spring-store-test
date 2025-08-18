create table profiles
(
    id             bigint auto_increment
        primary key,
    user_id        bigint                 not null,
    bio            text                   null,
    phone_number   varchar(15)            null,
    date_of_birth  date                   null,
    loyalty_points int unsigned default 0 not null,
    constraint profiles_pk_2
        unique (user_id),
    constraint profiles_users_id_fk
        foreign key (user_id) references users (id)
);