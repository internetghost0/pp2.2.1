# pp2.2.1

```
Hibernate: insert into cars (model, series) values (?, ?)
Hibernate: insert into users (car_id, email, name, last_name) values (?, ?, ?, ?)
Hibernate: insert into cars (model, series) values (?, ?)
Hibernate: insert into users (car_id, email, name, last_name) values (?, ?, ?, ?)
Hibernate: insert into cars (model, series) values (?, ?)
Hibernate: insert into users (car_id, email, name, last_name) values (?, ?, ?, ?)
Hibernate: select user0_.id as id1_1_, user0_.car_id as car_id5_1_, user0_.email as email2_1_, user0_.name as name3_1_, user0_.last_name as last_nam4_1_ from users user0_ cross join cars car1_ where user0_.car_id=car1_.id and car1_.model=? and car1_.series=?
Hibernate: select car0_.id as id1_0_0_, car0_.model as model2_0_0_, car0_.series as series3_0_0_ from cars car0_ where car0_.id=?
User [id=1, firstName=John, lastName=Doe, email=john.doe@example.com, car=Car [id=1, model=Toyota, series=123]]
Hibernate: select user0_.id as id1_1_, user0_.car_id as car_id5_1_, user0_.email as email2_1_, user0_.name as name3_1_, user0_.last_name as last_nam4_1_ from users user0_
Hibernate: select car0_.id as id1_0_0_, car0_.model as model2_0_0_, car0_.series as series3_0_0_ from cars car0_ where car0_.id=?
Hibernate: select car0_.id as id1_0_0_, car0_.model as model2_0_0_, car0_.series as series3_0_0_ from cars car0_ where car0_.id=?
Hibernate: select car0_.id as id1_0_0_, car0_.model as model2_0_0_, car0_.series as series3_0_0_ from cars car0_ where car0_.id=?
User [id=1, firstName=John, lastName=Doe, email=john.doe@example.com, car=Car [id=1, model=Toyota, series=123]]
User [id=2, firstName=Jane, lastName=Smith, email=jane.smith@example.com, car=Car [id=2, model=Honda, series=456]]
User [id=3, firstName=Kyle, lastName=Sherlock, email=kyle.sherlock@example.com, car=Car [id=3, model=Mistubishi, series=789]]
```