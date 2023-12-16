# Library Management System  
This is a a simple SpringBoot project.
It is an Implementation of how library works. User can create an account and choose how many books he wants to borrow on a checkout. He can have as many books as he wants and can have as many checkout as he wants.
## Used technologies:  
SpringBoot  
PostgreSQL  
Maven  
Hibernate  
## Database  
  
+------------+-------------------+---------+  
| Field      | Type              | Notes   |  
+------------+-------------------+---------+  
| Id         | Integer (PK)      |         |  
| name       | String            |         |  
| surname    | String            |         |  
| email      | String            |         |  
| age        | Integer           |         |  
+------------+-------------------+---------+  
 |  
 |  
 |  
 |  
 |  
/|\  
+----------------+-------------------+---------------------------------+  
| Field          | Type              | Notes                           |  
+----------------+-------------------+---------------------------------+  
| Id             | Integer (PK)      |                                 |  
| userId         | Integer (FK)      | References User(Id)             |  
| expirationDate | LocalDate         |                                 |  
| numberOfBooks  | Integer           |                                 |  
| isReturned     | Boolean           |                                 |  
+----------------+-------------------+---------------------------------+  
 |  
 |  
 |  
 |  
 |  
/|\  
+------------------+-------------------+---------------------------------+  
| Field            | Type              | Notes                           |  
+------------------+-------------------+---------------------------------+  
| Id               | Integer (PK)      |                                 |   
| checkOutId       | Integer (FK)      | References CheckOut(Id)         |  
| isAvailable      | Boolean           |                                 |   
| title            | String            |                                 |  
| author           | String            |                                 |  
| storyDescription | String            |                                 |  
| publisher        | String            |                                 |  
| publishYear      | Integer           |                                 |  
+------------------+-------------------+---------------------------------+  
