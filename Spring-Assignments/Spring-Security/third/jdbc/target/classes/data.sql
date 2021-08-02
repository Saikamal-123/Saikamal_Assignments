INSERT INTO users(username, password, enabled)
VALUES ('kamal','12345' ,true);

INSERT INTO users(username, password, enabled)
VALUES ('sai','sai123', true);


INSERT INTO authorities(username,authority)
VALUES ('kamal','ROLE_USER');

INSERT INTO authorities(username,authority)
VALUES ('sai','ROLE_ADMIN');