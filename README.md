#Spring Boot Archetype 项目

下载安装模板工程
~~~shell
git clone 
mvn clean install -DskipTests=true


~~~shell
mvn archetype:generate \
-DgroupId=io.github.lvyong1985 \
-DartifactId=demo-quickstart-springboot-archetype \
-Dversion=1.0.0-SNAPSHOT \
-DarchetypeGroupId=io.github.lvyong1985 \
-DarchetypeArtifactId=quickstart-springboot-archetype \
-DarchetypeVersion=1.0-SNAPSHOT -X -DarchetypeCatalog=local

~~~

参数说明

| Param        | Desc                       |
| ------------ | -------------------------- |
| -DgroupId    | 指定项目的分组，默认 io.github.lvyong1985     |
| -DartifactId | 指定项目的名称，默认 quickstart-springboot-archetype |
| -Dversion    | 指定项目的版本，默认 1.0.0-SNAPSHOT  |

