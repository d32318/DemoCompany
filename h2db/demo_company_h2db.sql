;             
CREATE USER IF NOT EXISTS "DEMO" SALT 'fe1370376a27a308' HASH 'ec6a7b0146de285e3ee778a9cfe2adef4144c6d75bb7ba7bfa5371b13bdcd060' ADMIN;       
CREATE CACHED TABLE "PUBLIC"."COMPANY_EMPLOYEE"(
    "NUMBER" INTEGER NOT NULL,
    "ADDRESS" VARCHAR(255),
    "AGE" INTEGER NOT NULL,
    "DEPARTMENT_ID" INTEGER,
    "GENDER" VARCHAR(255),
    "NAME" VARCHAR(255),
    "PHONE" VARCHAR(255),
    "TIME_CREATE" VARCHAR(255),
    "TIME_LAST_MODIFIED" VARCHAR(255)
);         
ALTER TABLE "PUBLIC"."COMPANY_EMPLOYEE" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_F" PRIMARY KEY("NUMBER");         
-- 9 +/- SELECT COUNT(*) FROM PUBLIC.COMPANY_EMPLOYEE;        
INSERT INTO "PUBLIC"."COMPANY_EMPLOYEE" VALUES
(202005001, 'Taipei', 30, 10001, 'Male', 'David', '0911310232', '2020-05-10T09:09:54', '2020-05-10T09:09:54'),
(202005002, 'Taipei', 18, 10002, 'Male', 'Tomy', '0911310236', '2020-05-10T09:17:32', '2020-05-10T09:18:11'),
(202005003, 'Taipei', 25, 10002, 'Female', 'Polly', '0922310273', '2020-05-10T09:53:44', '2020-05-11T02:00:57'),
(202005004, 'Taipei', 25, 10004, 'Female', 'Sandy', '0922310225', '2020-05-10T11:38:25', '2020-05-10T11:38:25'),
(202005005, 'Taipei', 25, 10004, 'Female', 'Chrintine', '0922310655', '2020-05-10T11:39:04', '2020-05-10T11:39:04'),
(202005006, 'Taipei', 25, 10003, 'Male', 'John', '0922310655', '2020-05-10T11:39:26', '2020-05-10T11:39:26'),
(202005007, 'Taipei', 50, 10003, 'Male', 'Gary', '0922310655', '2020-05-10T11:40:06', '2020-05-10T11:40:06'),
(202005008, 'Taipei', 50, 10003, 'Male', 'Gary', '0922310635', '2020-05-10T11:40:22', '2020-05-10T11:40:22'),
(202005009, 'Taipei', 50, 10003, 'Female', 'Sally', '0932310635', '2020-05-11T01:53:32', '2020-05-11T01:53:32');        
CREATE CACHED TABLE "PUBLIC"."COMPANY_DEPARTMENT"(
    "DEPARTMENT_ID" INTEGER NOT NULL,
    "DEPARTMENT_NAME" VARCHAR(20) NOT NULL
);     
ALTER TABLE "PUBLIC"."COMPANY_DEPARTMENT" ADD CONSTRAINT "PUBLIC"."COMPANY_DEPARTMENT_PK" PRIMARY KEY("DEPARTMENT_ID");       
-- 5 +/- SELECT COUNT(*) FROM PUBLIC.COMPANY_DEPARTMENT;      
INSERT INTO "PUBLIC"."COMPANY_DEPARTMENT" VALUES
(10001, STRINGDECODE('\u8cc7\u8a0a\u90e8')),
(10002, STRINGDECODE('\u6cd5\u52d9\u90e8')),
(10003, STRINGDECODE('\u8ca1\u91d1\u90e8')),
(10004, STRINGDECODE('\u4eba\u8cc7\u90e8')),
(10005, STRINGDECODE('\u901a\u8a0a\u90e8'));        
CREATE CACHED TABLE "PUBLIC"."DEPARTMENT_DOMAIN"(
    "DEPARTMENTID" INTEGER NOT NULL,
    "DEPARTMENT_NAME" VARCHAR(255)
);               
ALTER TABLE "PUBLIC"."DEPARTMENT_DOMAIN" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_9" PRIMARY KEY("DEPARTMENTID");  
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.DEPARTMENT_DOMAIN;       
CREATE CACHED TABLE "PUBLIC"."EMPLOYEE_DOMAIN"(
    "NUMBER" INTEGER NOT NULL,
    "ADDRESS" VARCHAR(255),
    "AGE" INTEGER NOT NULL,
    "DEPARTMENTID" INTEGER NOT NULL,
    "GENDER" VARCHAR(255),
    "NAME" VARCHAR(255),
    "PHONE" VARCHAR(255)
);           
ALTER TABLE "PUBLIC"."EMPLOYEE_DOMAIN" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_E" PRIMARY KEY("NUMBER");          
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.EMPLOYEE_DOMAIN;         
