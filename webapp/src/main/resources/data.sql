-- Insert 5 random users
INSERT INTO usr (id, name, surname, email, password, is_admin)
VALUES
    (1, 'John', 'Doe', 'john.doe@example.com', 'password123', false),
    (2, 'Jane', 'Smith', 'jane.smith@example.com', 'password456', true),
    (3, 'Alice', 'Johnson', 'alice.johnson@example.com', 'password789', false),
    (4, 'Bob', 'Brown', 'bob.brown@example.com', 'password101', false),
    (5, 'Charlie', 'Davis', 'charlie.davis@example.com', 'password102', true);

-- Insert 5 random tasks
INSERT INTO task (id, name, description, creator_id, creation_date, is_completed)
VALUES
    (1, 'Database Design', 'Design the initial database schema', 2, '2023-08-01 09:00:00', false),
    (2, 'Setup Development Environment', 'Prepare the development tools and workspace', 2, '2023-08-02 10:00:00', false),
    (3, 'Implement Authentication', 'Implement user login and registration', 5, '2023-08-03 11:00:00', false),
    (4, 'Create Landing Page', 'Develop the initial landing page of the application', 5, '2023-08-04 12:00:00', false),
    (5, 'Setup Database', 'Install and configure the database server', 2, '2023-08-05 13:00:00', false);

-- Insert 5 random assignments of tasks to users (UserTask)
INSERT INTO userTask (user_id, task_id, is_task_completed, assignment_date, assigned_by)
VALUES
    (1, 1, false, '2023-08-06 14:00:00', 2),
    (1, 2, false, '2023-08-07 15:00:00', 2),
    (3, 3, false, '2023-08-08 09:30:00', 5),
    (4, 4, false, '2023-08-09 16:45:00', 5),
    (5, 5, false, '2023-08-10 17:00:00', 2);

-- Insert 5 random comments
INSERT INTO comments (id, user_id, task_id, text, timestamp)
VALUES
    (1, 1, 1, 'Initial database schema looks good.', '2023-08-11 09:15:00'),
    (2, 3, 2, 'Development environment set up completed.', '2023-08-12 10:30:00'),
    (3, 4, 3, 'Authentication flow implemented.', '2023-08-13 11:45:00'),
    (4, 5, 4, 'Landing page created and live.', '2023-08-14 14:30:00'),
    (5, 2, 5, 'Database setup and configured.', '2023-08-15 15:45:00');