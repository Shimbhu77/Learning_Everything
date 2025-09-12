update user set name = 'Ram' where user_id = 2;

-- customer_id, product_id, order_id

select customer_id,count(order_id) as max_order from order_tbl group by customer_id
order by  max_order desc limit 1;

select product_id,count(order_id) as max_order from order_tbl group by customer_id order by  max_order desc limit 1;