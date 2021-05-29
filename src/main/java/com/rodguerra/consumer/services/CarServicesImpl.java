package com.rodguerra.consumer.services;

import com.rodguerra.consumer.model.Car;
import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface CarServicesImpl {
    void listenTopicCar(ConsumerRecord<String, Car> record);
}