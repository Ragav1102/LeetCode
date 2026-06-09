1# Write your MySQL query statement below
2select e.name as Employee from Employee e
3join employee m
4on e.managerId = m.id
5where e.salary > m.salary;