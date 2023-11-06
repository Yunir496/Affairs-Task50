create table todos
(
    id          int not null auto_increment,
    title       varchar(140),
    description varchar(2000),
    priority    int,
    date        timestamp,
    primary key (id)
)