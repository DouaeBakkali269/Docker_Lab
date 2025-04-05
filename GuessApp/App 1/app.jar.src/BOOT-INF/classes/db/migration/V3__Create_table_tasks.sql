CREATE TABLE TASKS (
    id identity,
    num varchar(30) not null,
    hour_cost int,
    duration int,
    project_id bigint
);