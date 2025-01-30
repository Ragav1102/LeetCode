WITH first_login AS (
    SELECT player_id, MIN(event_date) AS first_login_date
    FROM Activity
    GROUP BY player_id
),
consecutive_login AS (
    SELECT a.player_id
    FROM Activity a
    JOIN first_login f ON a.player_id = f.player_id
    WHERE DATEDIFF(a.event_date, f.first_login_date) = 1
)
SELECT ROUND(COUNT(DISTINCT cl.player_id) * 1.0 / (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) AS fraction
FROM consecutive_login cl;