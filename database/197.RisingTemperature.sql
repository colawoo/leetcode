-- Method 1
SELECT w1.id
FROM Weather w1, Weather w2
WHERE TO_DAYS(w1.RecordDate) - TO_DAYS(w2.RecordDate) = 1
    AND w1.temperature > w2.temperature;
-- Method 2
SELECT w1.id
FROM Weather w1, Weather w2
WHERE DATEDIFF(w1.RecordDate, w2.RecordDate) = 1
    AND w1.temperature > w2.temperature;
-- Method 3
SELECT w1.id
FROM Weather w1 JOIN Weather w2 
ON w1.recordDate = DATE_ADD(w2.recordDate, INTERVAL 1 DAY)
WHERE w1.temperature > w2.temperature;