# pp2.2.1

```
Hibernate: insert into cars (model, series) values (?, ?)
Hibernate: insert into users (car_id, email, name, last_name) values (?, ?, ?, ?)
Hibernate: insert into cars (model, series) values (?, ?)
Hibernate: insert into users (car_id, email, name, last_name) values (?, ?, ?, ?)
Hibernate: insert into cars (model, series) values (?, ?)
Hibernate: insert into users (car_id, email, name, last_name) values (?, ?, ?, ?)
Hibernate: select user0_.id as id1_1_0_, car1_.id as id1_0_1_, user0_.car_id as car_id5_1_0_, user0_.email as email2_1_0_, user0_.name as name3_1_0_, user0_.last_name as last_nam4_1_0_, car1_.model as model2_0_1_, car1_.series as series3_0_1_ from users user0_ inner join cars car1_ on user0_.car_id=car1_.id where car1_.model=? and car1_.series=?
User [id=19, firstName=John, lastName=Doe, email=john.doe@example.com, car=Car [id=25, model=Toyota, series=123]]
Hibernate: select distinct user0_.id as id1_1_0_, car1_.id as id1_0_1_, user0_.car_id as car_id5_1_0_, user0_.email as email2_1_0_, user0_.name as name3_1_0_, user0_.last_name as last_nam4_1_0_, car1_.model as model2_0_1_, car1_.series as series3_0_1_ from users user0_ inner join cars car1_ on user0_.car_id=car1_.id
User [id=19, firstName=John, lastName=Doe, email=john.doe@example.com, car=Car [id=25, model=Toyota, series=123]]
User [id=21, firstName=Kyle, lastName=Sherlock, email=kyle.sherlock@example.com, car=Car [id=27, model=Mistubishi, series=789]]
User [id=20, firstName=Jane, lastName=Smith, email=jane.smith@example.com, car=Car [id=26, model=Honda, series=456]]
```

