# kafka-demo
Kafka and spring boot sample.

Send messages as producer through the endpoint:

`/message/{message}`

It needs zookeeper and a kafka instance started up:

`.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties`

`.\bin\windows\kafka-server-start.bat .\config\server.properties`

Then create the topic "quercusdata-topic" 

`.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic 
quercusdata-topic`

and finally create a consumer instance:

`.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic quercusdata-topic --from-beginning`

Don't forget to kill the processes when quiting

`.\bin\windows\kafka-server-stop.bat`

`.\bin\windows\zookeeper-server-stop.bat`
