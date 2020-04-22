
CREATE database IF NOT EXISTS tasks;
USE tasks;
DROP DATABASE IF EXISTS tasks;
SHOW databases;
CREATE DATABASE todoapp;
SHOW databases;
USE todoapp;
CREATE TABLE IF NOT EXISTS tasks (
id INT unsigned NOT NULL AUTO_INCREMENT,
description VARCHAR(200) NOT NULL,
type ENUM ("project_related", "training", "management", "private") NOT NULL,
tag VARCHAR(10),
deadline date NOT NULL,
estimated_effort TiNYINT NOT NULL,
priority ENUM ("immediately:)", "urgent", "medium", "low", "never") NOT NULL,
subtask VARCHAR (100), 
status ENUM("in progress", "not yet started", "stuck", "feedback"),
is_completed BOOLEAN NOT NULL,
result VARCHAR (50),
PRIMARY KEY (id)
);

DESCRIBE tasks;
ALTER TABLE tasks
ADD COLUMN user_id INT AFTER id;

CREATE TABLE IF NOT EXISTS users(
id INT unsigned NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
role VARCHAR(100) NOT NULL,
workplace VARCHAR(100),
is_a_GFA_student BOOLEAN
);
DESCRIBE users;
USE todoapp;
DESCRIBE tasks;
DESCRIBE users;
ALTER TABLE tasks
ADD FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE tasks
MODIFY COLUMN user_id INT unsigned NOT NULL;
ALTER TABLE tasks
ADD FOREIGN KEY (user_id) REFERENCES users (id);
DESCRIBE users;
USE todoapp;
CREATE TABLE IF NOT EXISTS subtasks(
id INT unsigned NOT NULL AUTO_INCREMENT PRIMARY KEY,
task_id INT unsigned NOT NULL,
description VARCHAR(200) NOT NULL,
deadline date NOT NULL,
estimated_effort TiNYINT NOT NULL,
FOREIGN KEY (task_id) REFERENCES tasks (id));
DESCRIBE subtasks;
CREATE TABLE IF NOT EXISTS tags(
id INT unsigned NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(10) NOT NULL,
description VARCHAR(200) NOT NULL);
DESCRIBE tags;
CREATE TABLE IF NOT EXISTS tasks_tags(
task_id INTEGER unsigned NOT NULL,
tag_id INTEGER unsigned NOT NULL,
FOREIGN KEY (task_id) REFERENCES tasks (id),
    FOREIGN KEY (tag_id) REFERENCES users (id),
    PRIMARY KEY (task_id, tag_id,);