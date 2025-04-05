CREATE TABLE PROJECTS (
    id identity,
    title varchar(20) not null,
    description varchar(255) not null,
    mode varchar(100) not null,
    manager_id bigint,
    budget bigint,
    start_date timestamp
);