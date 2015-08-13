//package com.xyzeelab.octowookie.utils;
//
//import org.eclipse.paho.client.mqttv3.MqttClient;
//import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
//import org.eclipse.paho.client.mqttv3.MqttException;
//import org.eclipse.paho.client.mqttv3.MqttMessage;
//import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;;
//
//public class MqttTest {
//
//	public static void MakeConnection()
//	{
//		String topic = "MQTT Examples";
//		String content = "Message from MqttPublishSample";
//		int qos = 2;
//		String broker = "tcp://iot.eclipse.org:1883";
//		String clientId = "JavaSample";
//		MemoryPersistence persistence = new MemoryPersistence();
//		
//		try {
//			MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
//            MqttConnectOptions connOpts = new MqttConnectOptions();
//            connOpts.setCleanSession(true);
//            System.out.println("Connecting to broker: "+broker);
//            sampleClient.connect(connOpts);
//            System.out.println("Connected");
//            System.out.println("Publishing message: "+content);
//            MqttMessage message = new MqttMessage(content.getBytes());
//            message.setQos(qos);
//            sampleClient.publish(topic, message);
//            System.out.println("Message published");
//            sampleClient.disconnect();
//            System.out.println("Disconnected");
//            System.exit(0);
//		} catch (MqttException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}
