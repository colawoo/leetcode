-- Method 1
SELECT e1.Name Employee
FROM Employee e1, Employee e2
WHERE e1.ManagerId = e2.Id
AND e1.Salary > e2.Salary
-- Method 2
SELECT e1.name AS Employee
FROM Employee e1 INNER JOIN Employee e2 ON e1.managerId = e2.id
WHERE e1.salary > e2.salary