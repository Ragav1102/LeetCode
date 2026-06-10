1# Write your MySQL query statement below
2# Write your MySQL query statement below
3
4SELECT p.product_id ,p.product_name
5FROM product p
6JOIN sales s
7    ON p.product_id=s.product_id
8GROUP BY p.product_id,p.product_name
9HAVING MIN(s.sale_date)>= '2019-01-01'
10    AND MAX(s.sale_date)<= '2019-03-31'