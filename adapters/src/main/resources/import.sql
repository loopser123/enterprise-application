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