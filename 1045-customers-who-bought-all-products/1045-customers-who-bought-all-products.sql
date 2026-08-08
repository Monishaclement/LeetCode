# Write your MySQL query statement below
select distinct  customer_id
from Customer
join Product on Customer.product_key = Product.product_key
group by customer_id
having count(distinct Customer.product_key)=(select count(*) from Product);
