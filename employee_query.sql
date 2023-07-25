-- Select all the information from the "employees" table
SELECT *
-- Filter the results to only include employees who meet the following conditions:
FROM employees
WHERE 
    -- The employee's age is greater than 30 years old
    age > 30
    -- AND (both conditions must be true)
    AND
    -- The employee's salary is higher than $50,000
    salary > 50000;