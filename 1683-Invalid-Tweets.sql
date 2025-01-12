# Write your MySQL query statement below
sELECT tweet_id
FROM Tweets
Where length(content)>15;