DROP TABLE IF EXISTS people; 

CREATE TABLE people  (
    person_id BIGINT UNSIGNED NOT NULL  auto_increment,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    age BIGINT,
    PRIMARY KEY  (person_id)
);