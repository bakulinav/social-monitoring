# social-monitoring
Application for monitoring my accounts in social networks and collect statistics for following analysis

## Run
To protect sensitive data create separate `application.properties` config file in a local directory
and provide path to this directory over application argument `spring.config.location` while running process.
For example, to run it on Mac you will need to run application with command like this:

```
java -jar social-monitoring-0.0.1-SNAPSHOT.jar --spring.config.location=file:/Users/<user>/config/social-monitoring/
```
where content of directory `/Users/<user>/config/social-monitoring/` is:

```
$ ls
application.properties
```