1# Write your MySQL query statement below
2DELETE p1 
3FROM Person p1, Person p2 
4WHERE p1.email = p2.email AND p1.id > p2.id;
5