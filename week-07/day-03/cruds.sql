USE todoapp;
SELECT description FROM tasks
WHERE type = 'project_related';
SELECT description FROM todoapp.tasks
WHERE type = 'management';
SELECT name, workplace FROM users
JOIN tasks
ON users.id = tasks.user_id
WHERE users.role = 'project manager' && is_completed = 0;
SELECT description, status FROM tasks
WHERE description LIKE '%pr%';
SELECT description, priority, deadline FROM tasks
WHERE deadline BETWEEN 2020-01-01 AND 2020-06-01;
SELECT * FROM tasks;
SELECT * FROM tags;
SELECT type, is_completed FROM tasks 
JOIN tasks_tags 
ON id = tasks_tags.task_id
WHERE tasks_tags.task_id = 2;