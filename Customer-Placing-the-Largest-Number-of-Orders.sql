1# Write your MySQL query statement below
2SELECT customer_number
3FROM Orders 
4GROUP BY customer_number
5ORDER BY COUNT(customer_number) DESC
6LIMIT 1;