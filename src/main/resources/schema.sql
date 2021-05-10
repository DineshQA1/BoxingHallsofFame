drop table if exists boxing_halls_of_fame CASCADE;
CREATE TABLE boxing_halls_of_fame (
    id BIGINT AUTO_INCREMENT,
    name VARCHAR(255),
    weight_class VARCHAR(255),
   	won BIGINT,
   	drawn BIGINT,
   	lost BIGINT,
    undisputed BOOLEAN NOT NULL,
    PRIMARY KEY (id)
);