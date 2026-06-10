1# Write your MySQL query statement below
2select score ,
3DENSE_RANK() OVER(order by score desc) as 'rank'
4From Scores;
5
6
7