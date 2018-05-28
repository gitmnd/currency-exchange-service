https://github.com/in28minutes/spring-microservices/blob/master/03.microservices/currency-exchange-service

Database Scripts :

 CREATE TABLE "HR"."EXCHANGEVALUE"
   (	"ID" NUMBER,
	"FROMWHERE" VARCHAR2(20 BYTE),
	"TOWHERE" VARCHAR2(20 BYTE),
	"CONVERSIONMULTIPLE" NUMBER(*,0)
   );


Insert into EXCHANGEVALUE (ID,FROMWHERE,TOWHERE,CONVERSIONMULTIPLE) values (100001,'USD','INR',65);
Insert into EXCHANGEVALUE (ID,FROMWHERE,TOWHERE,CONVERSIONMULTIPLE) values (100002,'EUR','INR',75);

This Project is just JPA Activity and being used by currency-conversion-service project to refer by RestTemplate.


URL : http://localhost:8000/currency-exchange/from/EUR/to/INR



-> Any service request need to go through API Gateay must follow tye below URI structure

http://localhost:{zuul server port}/{application_name}/{application uri}

#call to exchange service via API agteway

http://localhost:8765/currency-exchange-service/currency-exchange/from/{from}/to/{to}