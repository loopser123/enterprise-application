INSERT INTO clients values(1L,'BMCE','boa@boad.com','SAID BENSAID');
INSERT INTO clients values(2L,'ADD','add@add.com','SAMIR BELMADANI'); 
INSERT INTO clients values(3L,'OCP','ocp@ocp.com','Terrab mohamed'); 

INSERT INTO projects values(1L,'CREDIT IMMO',1L); 
INSERT INTO projects values(2L,'AG',1L); 
INSERT INTO projects values(3L,'STARTUP',2L); 
INSERT INTO projects values(4L,'APPROVIS',2L); 
INSERT INTO projects values(5L,'TRACKABLE',3L); 
INSERT INTO projects values(6L,'SITEWEBLOCAL',NULL); 

INSERT INTO employers values('DeveloperJpaEntity',1L,'SAID','BENSAID','Narjis',200.00,NULL,23);
INSERT INTO employers values('DeveloperJpaEntity',2L,'HAMID','BENBOUBKER','Narjis',200.00,NULL,11);
INSERT INTO employers values('DeveloperJpaEntity',3L,'AYMAN','BENMBAREK','Narjis',200.00,NULL,32); 
INSERT INTO employers values('BusinessDeveloperJpaEntity',4L,'Samir','ElMoumni','Narjis',200.00,10,NULL); 
INSERT INTO employers values('BusinessDeveloperJpaEntity',5L,'Ayman','benmbarek','Narjis',200.00,3,NULL);
INSERT INTO employers values('BusinessDeveloperJpaEntity',6L,'Mohammed','Bendidi','Narjis',200.00,8,NULL);

INSERT INTO teams values(1L,'TEAM_PENETENCIER'); 
INSERT INTO teams values(2L,'TEAM_STARTUP'); 
INSERT INTO teams values(3L,'TEAM_APPROVIS'); 

INSERT INTO employers_by_teams values(1L,2L);
INSERT INTO employers_by_teams values(2L,2L);
INSERT INTO employers_by_teams values(2L,3L);

INSERT INTO projects_by_teams values(1L,1L); 
INSERT INTO projects_by_teams values(1L,2L); 