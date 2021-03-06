package com.zgl.spring.environment.listener.rabbit;

import com.rabbitmq.client.Channel;
import com.zgl.spring.environment.util.LogUtil;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

/**
 * @author zgl
 * @date 2019/3/29 下午2:34
 */
@Component
public class QueueZyyConsumer implements MessageListener {

	public void onMessage(String message, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag) {
		LogUtil.logger.info("消费者消费:{}", message);
	}

	@Override
	public void onMessage(Message message) {

	}
}