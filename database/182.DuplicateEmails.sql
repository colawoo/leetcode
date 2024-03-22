-- Method 1
SELECT email Email FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
-- Method 2
SELECT DISTINCT(p1.email) AS Email from Person p1, Person p2
WHERE p1.id <> p2.id AND p1.email = p2.email;