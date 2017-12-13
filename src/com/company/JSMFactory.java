package com.company;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class JSMFactory {
    public ConnectionFactory createConnectionFactory(){
        return new ActiveMQConnectionFactory("tcp://localhost:61616");
    }
    public QueueConnectionFactory createQueueConnectionFactory(){
        return new ActiveMQConnectionFactory("tcp://localhost:61616");
    }
    public TopicConnectionFactory createTopicConnectionFactory(){
        return new ActiveMQConnectionFactory("tcp://localhost:61616");
    }
    public Connection createConnection(ConnectionFactory cf) throws JMSException {
        return cf.createConnection();
    }

    public QueueConnection createQueueConnection(QueueConnectionFactory cf) throws JMSException {
        return cf.createQueueConnection();
    }
    public TopicConnection createQueueConnection(TopicConnectionFactory cf) throws JMSException {
        return cf.createTopicConnection();
    }

//    public ConnectionFactory createConnectionFactory(){
//        return new ActiveMQConnectionFactory("tcp://localhost:61616");
//    }
}
