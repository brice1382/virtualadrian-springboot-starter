
SET REFERENTIAL_INTEGRITY FALSE;
BEGIN TRANSACTION;
    DELETE FROM roles;
    DELETE FROM users;
COMMIT;
SET REFERENTIAL_INTEGRITY TRUE;



INSERT INTO roles VALUES(0, 'USER');
INSERT INTO roles VALUES(1, 'SYS_ADMIN');




INSERT INTO users(id, email, name, password, role_id)
VALUES(1001, 'adrian01@em.com', 'random-name1001', 'password1001', 0);

INSERT INTO users(id, email, name, password, role_id)
VALUES(1002, 'adrian01@em.com', 'random-name1002', 'password1002', 0);

INSERT INTO users(id, email, name, password, role_id)
VALUES(1003, 'adrian01@em.com', 'random-name1003', 'password1003', 0);
