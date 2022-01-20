## History

* JPA Entities
    * learn.hsdjpa.hsdjpaintro.domain.Book
    * Method equals() that compares just the id - It is discouraged solution (JPWH,10.3.2)
* Spring Data Repositories ([note](https://www.notion.so/Hibernate-and-Spring-Data-JPA-c6e94f30f1c444748e55f9ee662e9955#4387ca37da0f492497e71cb5c50cb410))
    * Extend `org.springframework.data.jpa.repository.JpaRepository`
* Initialize data ([note](https://www.notion.so/Hibernate-and-Spring-Data-JPA-c6e94f30f1c444748e55f9ee662e9955#5974ebe7e6bf4cc48c537382b2923dd5))
    * Extend `org.springframework.boot.CommandLineRunner`
* SQL logging ([note](https://www.notion.so/Hibernate-and-Spring-Data-JPA-c6e94f30f1c444748e55f9ee662e9955#5226350bb32e47c3a3855556b9adf7a0))
    * to show with bind parameters as question marks, add to application.properties `spring.jpa.show-sql=true`
    * or to make output more user-friendly:
        * Show SQL: `spring.jpa.properties.hibernate.show_sql=true`
        * Format SQL: `spring.jpa.properties.hibernate.format_sql=true`
        * Show bind parameters: `logging.level.org.hibernate.type.descriptor.sql=trace`
