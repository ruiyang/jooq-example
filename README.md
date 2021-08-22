# Start db
```shell
docker-compose -f ./docker/compose-mysql.yml up &
```
# Migrate
```shell
./gradlew flyMigrate -i
```

# Code gen
```shell
./gradlew -p jooq-3.14 generateJooq
```