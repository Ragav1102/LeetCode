1# Write your MySQL query statement below
2select name as Customers from Customers c
3left join Orders o on
4c.id = o.customerId
5where o.customerId is null;