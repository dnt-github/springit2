INSERT INTO Link (id, created_by, creation_date, last_modified_date, last_modified_by, title, url)
VALUES(1,null, NOW(), NOW(), null, 'Starting with spring boot 2', 'https://www.google.com');

INSERT INTO comment (id, created_by,creation_date, last_modified_by, last_modified_date, body, link_id)
VALUES(1, null, NOW(), null, NOW(), 'What an awsome idea for this site.',1);