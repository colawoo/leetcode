-- Method 1
SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p LEFT JOIN Address a
ON p.personId = a.personId;
-- Method 2
SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p LEFT JOIN Address a 
USING (personId);
