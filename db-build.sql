-- USERS --
CREATE TABLE users
(
    id           INT(11) NOT NULL AUTO_INCREMENT,
    email        VARCHAR(255) NOT NULL,
    name         VARCHAR(255) NOT NULL,
    password     VARCHAR(255) NOT NULL,
    enabled      BOOL NOT NULL,
    created_at   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP NULL,
    deleted_at   TIMESTAMP NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_general_ci;

-- AUTHORITIES --
CREATE TABLE authorities
(
    id           INT(11) NOT NULL AUTO_INCREMENT,
    username     VARCHAR(255) NOT NULL,
    authority    VARCHAR(255) NOT NULL,
    created_at   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP NULL,
    deleted_at   TIMESTAMP NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_general_ci;