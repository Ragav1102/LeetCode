1# Write your MySQL query statement below
2select email from Person 
3group by email
4having count(email)>1;