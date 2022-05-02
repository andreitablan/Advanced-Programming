CREATE TABLE CITIES 
(
  ID NUMBER NOT NULL 
, COUNTRY VARCHAR2(100 BYTE) 
, NAME VARCHAR2(100 BYTE) 
, CAPITAL NUMBER DEFAULT 0 
, LATITUDE FLOAT(126) 
, LONGITUDE FLOAT(126) 
, CONSTRAINT CITIES_PK PRIMARY KEY 
  (
    ID 
  )
  USING INDEX 
  (
      CREATE UNIQUE INDEX CITIES_PK ON CITIES (ID ASC) 
      LOGGING 
      TABLESPACE USERS 
      PCTFREE 10 
      INITRANS 2 
      STORAGE 
      ( 
        INITIAL 65536 
        NEXT 1048576 
        MINEXTENTS 1 
        MAXEXTENTS UNLIMITED 
        BUFFER_POOL DEFAULT 
      ) 
      NOPARALLEL 
  )
  ENABLE 
) 
LOGGING 
TABLESPACE USERS 
PCTFREE 10 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  BUFFER_POOL DEFAULT 
) 
NOPARALLEL;
