-- solution 1
DELETE FROM Person WHERE id NOT IN (
    SELECT id FROM (
        SELECT MIN(id) AS id FROM Person GROUP BY email
    ) AS temp
);
-- solution 2
DELETE FROM Person p WHERE NOT EXISTS (
    SELECT temp.id FROM (
        SELECT MIN(id) AS id FROM Person GROUP BY email
    ) AS temp WHERE p.id = temp.id
);
-- solution 3
DELETE p1 FROM Person p1, Person p2 
WHERE p1.email = p2.email 
  AND p1.id > p2.id;
