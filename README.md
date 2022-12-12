# Hibernate 
- Hibernate is an object-relational mapping tool for the java programming language
- Object-relational mapping (ORM) is a programming technique for converting data between incompatible type system in object oriented programming languages
```
Ex: Java object <-> Hibernate <-> Database
```
- Create java object ans save to database and vice versa, this process can be leanthy, by using hibernate we can make it simple

## Benifits
- Hibernate is database independent
- Handles low level SQL for you
- Minimize JDBC related code in your app

## Session factory v/s Session
### Session factory
- Session factory creates session objects
- Session factory is a heavy weight object, so usually it is created during application start up and used later
- Sample configuration file (hibernate.cfg.xml) helps Session factory to get initiated
### Session
- A Session is used to get a physical connection with a database
- The Session object is lightweight and short lived object
- not thread safe
- that's why we can create multiple session and close it when our task is done