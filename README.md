# Spring Boot & Jackson 对于日期时间类型处理的例子

Spring Boot利用JacksonAutoConfiguration自动配置了ObjectMapper，并且在Spring MVC中全局性的使用了它，这样开发者就能够很方便实现Json序列化、反序列化。

不过Jackson对于日期时间类型的行为存在一些坑，一不小心就可能发生无法反序列化以及序列化的结果不符合预期，所以本文罗列了一些例子，帮助开发者获得正确的结果。

* [使用Spring Boot全局配置Jackson的例子][src-No_JsonFormat.md]
* [携带时区信息的日期时间类型的序列化与反序列化][src-Zone_DateTime_Type.md]
* [使用@JsonFormat的序列化与反序列化][src-JsonFormat.md]

  
[src-No_JsonFormat.md]: No_JsonFormat.md
[src-Zone_DateTime_Type.md]: Zone_DateTime_Type.md
[src-JsonFormat.md]: JsonFormat.md
